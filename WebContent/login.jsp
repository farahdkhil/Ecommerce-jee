<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Authentification</title>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
<p></p>
<div class="container">
<div class="card">
  <div class="card-header">
    Login
  </div>
  <div class="card-body">
      <form action="produits.jsp" method="post">
      <div class="form-group">
       <label class="control-label">Nom :</label>
       <input type="text" name="nom" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1"/>
      </div>
      <div class="form-group">
       <label class="control-label">Mot de passe :</label>
       <input type="password" name="mdp" class="form-control" placeholder="password" aria-label="Username" aria-describedby="basic-addon1"/>
      </div>
      <div>
        <button type="submit" class="btn btn-warning">Log In</button>
      </div>
      </form>     
     
  </div>
</div>
</div>
</body>
<p></p>
<%@include file="footer.jsp" %>
</html>