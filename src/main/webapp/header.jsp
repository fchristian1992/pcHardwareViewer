<header>
    <div class="container pb-5">
        <h1 class="text-center">PC Hardware Viewer</h1>

        <c:if test="${userName != null}">
            <nav class="text-center">
                <a href="index.jsp">Home </a>&#8226
                <a href="parts_list.jsp"> Parts List </a>&#8226
                <a href="logOut"> Log out</a>
            </nav>
        </c:if>

        <c:if test="${userName == null}">
            <div class="text-center">
                <a href="logIn">Log In/Sign up</a>
            </div>
        </c:if>
    </div>
</header>