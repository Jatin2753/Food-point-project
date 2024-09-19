<%@page import="java.sql.ResultSet"%>

<%-- 
    Document   : category
    Created on : 23 Jun, 2024, 4:14:48 PM
    Author     : JATIN GUPTA
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title>Product Add</title>
        <%@include file="links.jsp" %>
        <style>
            body{
                overflow-x: hidden;
            }
            .cat-input{
                padding: 10px 130px;
                text-align: center;
            }
            textarea{
                padding: 10px 380px;
            }
        </style>
    </head>
    <body>	
        <%@include file="header.jsp" %>
        <%
            if (request.getParameter("ProductDel") != null) {
                String ProductDel = request.getParameter("ProductDel");
                String sql = "delete from product where id =" + ProductDel;
                int srpdel = food.DataUtility.executeDML(sql);
            }

            if (request.getParameter("productname") != null) {
                String productname = request.getParameter("productname");
                String pid = request.getParameter("pid");
                String catid = request.getParameter("catid");
                String subcatid = request.getParameter("subcatid");
                String productprice = request.getParameter("productprice");
                String productdesc = request.getParameter("productdesc");
                String img1 = request.getParameter("img1");
                String img2 = request.getParameter("img2");
                String retailerid=request.getParameter("retailerid");
                String sql = "UPDATE product SET product_name='" + productname + "',product_price='" + productprice + "',product_desc='" + productdesc + "',catid='" + catid + "',subcatid='" + subcatid + "',img1='" + img1 + "',img2='" + img2 + "',retailerid='"+retailerid+"' WHERE id=" + pid;
          
                int rep = food.DataUtility.executeDML(sql);
            }
        %>



        <%
            if (request.getParameter("ProductEdit") != null) {
                String ProductEdit = request.getParameter("ProductEdit");
                ResultSet rsp = food.DataUtility.executeDQL("SELECT * FROM product WHERE id=" + ProductEdit);
                if (rsp.next()) {
        %> 
        <div class="inner-block" style="height: 630px">
            <div class="cols-grids panel-widget">
                <h2>Product Edit</h2>
                <form method="post"  action="ProductEdit.jsp" >               
                    <div class="row mb40">
                         <div class="col-md-6">
                            <label>Shop Name</label>
                            <select name="retailerid" class="form-control" onclick="getSubCat(this.value)">
                                <option>Choose Shop Name</option>

                                <%
                                    ResultSet rsr = food.DataUtility.executeDQL("SELECT * FROM retailer ORDER BY shop_name");

                                    while (rsr.next()) {

                                %>
                                <option selected="true" value="<% out.print(rsr.getString(1)); %>"><% out.print(rsr.getString(2)); %></option>


                                <%

                                    }
                                %>
                            </select>
                        </div> 
                        <div class="col-md-6">
                            <label>Category Name</label>
                            <select name="catid" class="form-control" onclick="getSubCat(this.value)">
                                <option>Choose Category Name</option>

                                <%
                                    ResultSet rsc = food.DataUtility.executeDQL("SELECT * FROM category ORDER BY category_name");

                                    while (rsc.next()) {

                                %>
                                <option selected="true" value="<% out.print(rsc.getString(1)); %>"><% out.print(rsc.getString(2)); %></option>


                                <%

                                    }
                                %>
                            </select>
                        </div> 
                        <div class="col-md-6">
                            <label>Sub Category Name</label>
                            <select name="subcatid" id="subcatidsel" class="form-control">

                            </select>
                        </div>
                        <div class="col-md-6">
                            <lable>Product Name</lable><br>
                            <input type="text" placeholder="Enter Product Name" class="cat-input" name="productname" required="">
                            <input type="hidden" value="<%= rsp.getString("id")%>" name="pid" />
                        </div>
                        <div class="col-md-6">
                            <lable>Product Price</lable><br>
                            <input type="text" placeholder="Enter Product Price" class="cat-input" name="productprice" required="">
                        </div>
                        <div class="col-md-6">
                            <lable>Image 1</lable><br>
                            <input type="file" placeholder="Enter Image 1" class="cat-input" name="img1" required="">
                        </div>
                        <div class="col-md-6">
                            <lable>Image 2</lable><br>
                            <input type="file" placeholder="Enter Image 2" class="cat-input" name="img2" required="">
                        </div>
                    </div>
                    <div class="row mb40">
                        <div class="col-md-12">
                            <lable>Product Description</lable><br>
                            <textarea type="text" value="description" name="productdesc" required="" placeholder="Enter Description">
                                   
                            </textarea>
                        </div>

                    </div> 
                    <div class="col-lg-12">
                        <button type="submit" class="btn btn-success">Submit</button>
                    </div>

                </form>
            </div>	
        </div>

        <%
                }
            }
        %>

        <div class="inner-block" style="height: 630px">
            <div class="cols-grids panel-widget">
                <h2>Product Edit</h2>  
                <div class="form-group col-lg-12 ">
                    <table class="data table table-bordered table-striped">
                        <tr>
                            <th>S.NO</th>
                            <th>Category Id</th>
                            <th>Sub Category Id</th>
                            <th>Retailer Id</th>
                            <th>Product Name</th>
                            <th>Product Price</th>
                            <th>Product Description</th>
                            <th>Image 1</th>
                            <th>Image 2</th>
                            <th>Action</th>
                        </tr>
                        <%
                            ResultSet rs = food.DataUtility.executeDQL("SELECT * FROM product ORDER BY id");
                            while (rs.next()) {
                        %>
                        <tr>
                            <td><%= rs.getString("id")%></td>
                            <td><%= rs.getString("catid")%></td>
                            <td><%= rs.getString("subcatid")%></td>
                             <td><%= rs.getString("retailerid")%></td>
                            <td><%= rs.getString("product_name")%></td>
                            <td><%= rs.getString("product_price")%></td>
                            <td><%= rs.getString("product_desc")%></td>
                            <td><%= rs.getString("img1")%></td>
                            <td><%= rs.getString("img2")%></td>
                            <td>
                                <a href="ProductEdit.jsp?ProductEdit=<% out.print(rs.getString("id")); %>" class="btn btn-warning">Edit</a>
                                <a href="ProductEdit.jsp?ProductDel=<% out.print(rs.getString("id")); %>" class="btn btn-danger">Delete</a>
                            </td>
                        </tr>
                        <%
                            }
                        %>
                    </table>
                </div>
            </div>
            <div class="clearfix"></div>
        </div>
        <!--inner block end here-->
        <!--copy rights start here-->
        <%@include file="footer.jsp" %>
        <!--COPY rights end here-->
    </div>
</div>
<!--slider menu-->
<%@include file="sidebar.jsp" %>
<div class="clearfix"></div>
</div>
<!--slide bar menu end here-->
<script>
    var toggle = true;

    $(".sidebar-icon").click(function () {
        if (toggle) {
            $(".page-container").addClass("sidebar-collapsed").removeClass("sidebar-collapsed-back");
            $("#menu span").css({"position": "absolute"});
        } else {
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
</body>
<script>
    function getSubCat(id) {


        $("#subcatidsel").html('<option>Loading...</option>');
        $.ajax({
            type: "GET",
            url: "getSubCatByCatId.jsp",
            data: {catid: id},
            success: function (data) {
                $("#subcatidsel").html(data);
            },
            error: function (xhr, status, error) {
                console.error("AJAX Error:", status, error);
                $("#subcatidsel").html('<option value="">Failed to load subcategories</option>');
            }
        });
    }
</script>
</html>
