
<nav class="navbar navbar-expand-lg navbar-light bg-light">

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <c:if test="${sesion = true}">
            <li class="nav-item active">
                <a class="nav-link" href="Index.jsp">Home <span class="sr-only"></span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="Cliente.jsp">Clientes</a>
            </li>  
            <li class="nav-item">
                <a class="nav-link" href="Mensajes.jsp">Mensajes</a>
            </li>
            
             
            </c:if>
        </ul>
    </div>
</nav>