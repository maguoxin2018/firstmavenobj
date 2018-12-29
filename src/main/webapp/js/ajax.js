window.onload = function() {
//通过id获取页面button的onclick点击事件
    document.getElementById("username").onblur = function() {
        var username = document.getElementById("username").value;
        //1.创建ajax对象
        // var xhr = ajaxFunction();
        var xhr = new XMLHttpRequest();
        xhr.onreadystatechange = function() {
            //处理后台返回的数据
            if(xhr.readyState == 4) {
                if(xhr.status == 200) {
                    //获取响应到的文本
                    var data= xhr.responseText;
                    //响应到的文本添加到div里面
                    document.getElementById("divcheck").innerHTML = data;
                }
            }
        }
        //规定发送数据的形式（post/get），url，以及传输方式(同步/异步)
        xhr.open("post","Servletasd?timeStamp="+new Date().getTime(),true);
        //post方式需要加下边这句，get方式不需要
        xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
        //将页面输入数据发送到后台
        xhr.send("user_name="+username);
    }
}

// function ajaxFunction() {
//     var xmlHttp;
//     try {
//         xmlHttp = new XMLHttpRequest();
//     } catch(e) {
//         try {
//             xmlHttp = new ActiveXObject("Msxm12.XMLHTTP");
//         } catch(e) {
//             try {
//                 xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
//             } catch(e) {}
//         }
//     }
//     return xmlHttp;
// }
