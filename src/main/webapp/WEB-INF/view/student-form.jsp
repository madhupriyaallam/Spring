<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
        First Name : <form:input path = "firstName"/>
        <br><br>
        Last Name : <form:input path = "lastName"/>
        <br><br>
        Country :
        <form:select path="country">
            <form:option value = "Brazil" label = "Brazil"/>
            <form:option value = "France" label = "France"/>
            <form:option value = "Germany" label = "Germany"/>
            <form:option value = "India" label = "India"/>
        </form:select>
        <br><br>
        Favourite Language :
        Java <form:radiobutton path = "favouriteLanguage" value = "Java"/>
        C <form:radiobutton path = "favouriteLanguage" value = "C"/>
        Python <form:radiobutton path = "favouriteLanguage" value = "Python"/>
        C# <form:radiobutton path = "favouriteLanguage" value = "C#"/>
        <br><br>
        Operating Systems:
        Linux <form:checkbox path = "operatingSystems" value = "Linux"/>
        Ms Windows <form:checkbox path = "operatingSystems" value = "Ms Windows"/>
        Mac Os <form:checkbox path = "operatingSystems" value = "Mac Os"/>
        <br><br>
        <input type = "submit" value = "Submit" />
    </form:form>
</body>
</html>