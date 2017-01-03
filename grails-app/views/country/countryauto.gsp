

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<r:require module="jquery-ui" />
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="/resources/demos/style.css">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="layout" content="main" />
    <title></title>
    <script>
        $(document).ready(function() {
            $.ajax({
                type: "GET",
                url: "${createLink(controller: 'country',action: 'getAllCountries')}",
                dataType:"json",
                success : function(data) {
                    $("#country_textField").autocomplete({
                        source: data
                    });
                }
            });
        });
        </script>
</head>
<body>
    <g:form>
        <div class="ui-widget">
       <label for="country_textField">Country : </label> <g:textField name="country" id="country_textField" placeholder="Enter country..." value=""/>
        </div>
    </g:form>
</body>
</html>