<%@ page import = "start.Calculator" %>

<jsp:useBean id="calculator" class="start.Calculator" scope="session"/>
<jsp:setProperty name="calculator" property="*"/>

<%
String val = "40-10";
int operation = 0;
if (request.getParameter("arithmeticString") != null) { 
    val = request.getParameter("arithmeticString");
    val = val.replace("k","+");
}

if (request.getParameter("percent") != null) { 
   operation = 1;
}

else if (request.getParameter("sqrt") != null) { 
   operation = 2;
}

%>

<%=new Calculator().test(val,operation)%>

