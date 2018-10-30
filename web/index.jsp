<%if(session.getAttribute("user") == null){%>
    <%@include file="WEB-INF/jspf/login/login.jspf"%>
    <%@include file="WEB-INF/jspf/login/register.jspf"%>
<%}else{%>
    <% response.sendRedirect("http://localhost:8084/MyNews/pages/feed.jsp");%>
<%}%>