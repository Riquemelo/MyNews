<%-- 
    Document   : loginService
    Created on : 29/10/2018, 19:34:22
    Author     : riquemlo
--%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="org.json.JSONObject"%>
<%@page import="mynews.Conexao"%>
<%@page import="java.security.MessageDigest"%>
<%
    String method = request.getParameter("method");
    JSONObject result = new JSONObject();
    String output = "";

    switch (method) {
        case "Login":
            String user = request.getParameter("user");
            String pass = request.getParameter("pass");
            boolean success = false;
            String errorMessage = "";
            String stacktrace = "";
            
            Conexao c = new Conexao();

            try {
                ResultSet rs = c.conn
                        .prepareStatement("SELECT nm_user, cd_password, cd_email "
                                + "FROM tb_users "
                                + "WHERE nm_user = '" + user + "' "
                                + "AND cd_password = '" + pass + "';").executeQuery();

                if (rs.next()) {
                    success = true;
                    session.setAttribute("user", user);
                    session.setAttribute("email", rs.getString("cd_email"));
                    session.setAttribute("name", rs.getString("nm_user"));
                } else {
                    result.put("stacktrace", "invalid");
                    result.put("errorMessage", "Login e/ou senha invalidos");
                }
                result.put("success", success);
                output = result.toString();
                out.println(output);
            } catch (Exception ex) {
                result.put("success", false);
                result.put("stacktrace", "internal");
                result.put("errorMessage", ex);
                
                output = result.toString();
                out.println(output);
            } finally {
                c.conn.close();
            }
            break;
        case "Logoff":
            session.invalidate();
            break;
        default:
            out.println("Metodo Invalido");
            break;
    }


%>
