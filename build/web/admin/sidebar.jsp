<%-- 
    Document   : sidebar
    Created on : 23 Jun, 2024, 4:18:50 PM
    Author     : JATIN GUPTA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div class="sidebar-menu">
    <div class="logo"> <a href="#" class="sidebar-icon"> <span class="fa fa-bars"></span> </a> <a href="#"> <span id="logo" ></span> 
            <!--<img id="logo" src="" alt="Logo"/>--> 
        </a> </div>		  
    <div class="menu">
        <ul id="menu" >
            <li id="menu-home" ><a href="index.html"><i class="fa fa-tachometer"></i><span>Dashboard</span></a></li>
            <li><a href="#"><i class="fa fa-bars"></i><span>Category</span><span class="fa fa-angle-right" style="float: right"></span></a>
                <ul>
                    <li><a href="category.jsp">Add</a></li>
                    <li><a href="category_edit.jsp">Edit</a></li>		            
                </ul>
            </li>
            <li id="menu-comunicacao" ><a href="#"><i class="fa fa-book nav_icon"></i><span>Sub Category</span><span class="fa fa-angle-right" style="float: right"></span></a>
                <ul id="menu-comunicacao-sub" >
                    <li id="menu-mensagens" style="width: 120px" ><a href="subcat.jsp">Add</a>		              
                    </li>
                    <li id="menu-arquivos" ><a href="subcatedit.jsp">Edit</a></li>

                </ul>
            </li>
            <li id="menu-academico" ><a href="#"><i class="fa fa-file-text"></i><span>Products</span><span class="fa fa-angle-right" style="float: right"></span></a>
                <ul id="menu-academico-sub" >
                    <li id="menu-academico-boletim" ><a href="ProductAdd.jsp">Add</a></li>
                    <li id="menu-academico-avaliacoes" ><a href="ProductEdit.jsp">Edit</a></li>		           
                </ul>
            </li>

            <li><a href="charts.html"><i class="fa fa-bar-chart"></i><span>Charts</span></a></li>
            <li><a href="#"><i class="fa fa-envelope"></i><span>Mailbox</span><span class="fa fa-angle-right" style="float: right"></span></a>
                <ul id="menu-academico-sub" >
                    <li id="menu-academico-avaliacoes" ><a href="inbox.html">Inbox</a></li>
                    <li id="menu-academico-boletim" ><a href="inbox-details.html">Compose email</a></li>
                </ul>
            </li>
            <li><a href="#"><i class="fa fa-cog"></i><span>System</span><span class="fa fa-angle-right" style="float: right"></span></a>
                <ul id="menu-academico-sub" >
                    <li id="menu-academico-avaliacoes" ><a href="404.html">404</a></li>
                    <li id="menu-academico-boletim" ><a href="blank.html">Blank</a></li>
                </ul>
            </li>
            <li><a href="#"><i class="fa fa-shopping-cart"></i><span>E-Commerce</span><span class="fa fa-angle-right" style="float: right"></span></a>
                <ul id="menu-academico-sub" >
                    <li id="menu-academico-avaliacoes" ><a href="product.html">Product</a></li>
                    <li id="menu-academico-boletim" ><a href="price.html">Price</a></li>
                </ul>
            </li>
        </ul>
    </div>
</div>
<div class="clearfix"> </div>
</div>
<!--slide bar menu end here-->
<script>
    var toggle = true;

    $(".sidebar-icon").click(function () {
        if (toggle)
        {
            $(".page-container").addClass("sidebar-collapsed").removeClass("sidebar-collapsed-back");
            $("#menu span").css({"position": "absolute"});
        }
        else
        {
            $(".page-container").removeClass("sidebar-collapsed").addClass("sidebar-collapsed-back");
            setTimeout(function () {
                $("#menu span").css({"position": "relative"});
            }, 400);
        }
        toggle = !toggle;
    });
</script>
<!--scrolling js-->
<script src="js/jquery.nicescroll.js"></script>
<script src="js/scripts.js"></script>
<!--//scrolling js-->
<script src="js/bootstrap.js"></script>
<!-- mother grid end here-->
