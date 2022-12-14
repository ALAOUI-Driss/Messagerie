<%@page import="com.entities.Email"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Acceuil</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
	<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">
</head>
<body>
<%@ page import="java.util.List" %>
<%
    List<Email> emails = (List<Email>) request.getAttribute("emails");
%>
<div class="container mt-5">
    <div class="row">
        <div class="col-lg-12">
            <div class="card">
                <div class="card-body">
	                <div class="d-flex justify-content-end">
	                	<div class="col-lg-2 col-md-2 mb-3">
                            <a href="log-out" class="btn btn-success waves-effect waves-light btn-block">LOGOUT</a>
                        </div>
	                </div>
                    <div class="row">
                        <!-- Left sidebar -->
                        <div class="col-lg-2 col-md-2 mb-3">
                            <a href="mail" class="btn btn-success waves-effect waves-light btn-block">New Mail</a>
                        </div>
                        <div class="col-lg-12 col-md-12">
                            <div class="card shadow-none mt-3 border border-light">
                                <div class="table-responsive">
                                    <table class="table">
                                        <tbody id="inbox_body_table">
                                        <%
                                            for (Email e:emails){
                                        %>
                                        <tr>
                                            <td class="name"><%=e.getFrom()%></td>
                                            <td class='subject'> 
                                                    <%= e.getSubject()%>                                   		<%= e.getSubject()%>
                                            </td>
                                            <td class="subject">
                                           		<%= e.getMessage()%>
                                            </td>
                                            <!--  <td class="time">
                                                <%=e.getCreatedAt()%>
                                            </td> -->
                                        </tr>
                                        <%
                                            }
                                        %>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                                <!-- card -->
                        </div> <!-- end Col-9 -->

                    </div><!-- End row -->

                </div>
            </div>
        </div>
    </div><!-- End row -->

</div>
</body>
</html>