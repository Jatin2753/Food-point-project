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
        <!-- /script-for sticky-nav -->
        <!--inner block start here-->
        <%
            if (request.getParameter("productname") != null) {
                String productname = request.getParameter("productname");
                String catid = request.getParameter("catid");
                String subcatid = request.getParameter("subcatid");
                String productprice = request.getParameter("productprice");
                String img1 = request.getParameter("img1");
                String img2 = request.getParameter("img2");
                String productdesc = request.getParameter("productdesc");
                String retailerid=request.getParameter("retailerid");
                String sql = "INSERT INTO product(catid,subcatid,product_name,product_price,product_desc,img1,img2,retailerid,dateon)VALUES(" + catid + "," + subcatid + ",'" + productname + "'," + productprice + ",'" + productdesc + "','" + img1 + "','" + img2 + "','"+retailerid+"',NOW());";
                int rp = food.DataUtility.executeDML(sql);

            }
        %>
        <div class="inner-block" style="height: 630px">
            <div class="cols-grids panel-widget">
                <h2>Product Add</h2>
                <form method="post"  action="ProductAdd.jsp">               
                    <div class="row mb40">
                          <div class="col-md-6">
                            <label>Shop Name</label>
                            <select name="retailerid" class="form-control">
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
    </div>

    <!--inner block end here-->
    <!--copy rights start here-->
    <%@include file="footer.jsp" %>
    <!--COPY rights end here-->
</div>
<!--slider menu-->
  
<%@include file="sidebar.jsp" %>
</body>
<script>
 function getSubCat(id) {
    
    
    $("#subcatidsel").html('<option>Loading...</option>');
    $.ajax({
        type: "GET",
        url: "getSubCatByCatId.jsp",
        data: { catid: id },
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


