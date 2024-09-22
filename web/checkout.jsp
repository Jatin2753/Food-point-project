
<!DOCTYPE html>
<html>
    <head>
        <title>Products</title>
        <%@ include file="top.jsp" %>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <!-- products-breadcrumb -->
        <div class="products-breadcrumb">
            <div class="container">
                <ul>
                    <li><i class="fa fa-home" aria-hidden="true"></i><a href="index.html">Home</a><span>|</span></li>
                    <li>Check Out</li>
                </ul>
            </div>
        </div>
        <div class="checkout">
            <div class="container">
                <h3>My Shopping Bag</h3>
                <div class="table-responsive checkout-right animated wow slideInUp" data-wow-delay=".5s">
                    <table class="timetable_sub">
                        <thead>
                            <tr>
                                <th>Remove</th>
                                <th>Product Name</th>
                                <th>Product</th>
                                <th>Quantity</th>
                                <th>Rate</th>
                                <th>Total</th>
                            </tr>
                        </thead>
                        <tr class="rem1">
                            <td class="invert-closeb">
                                <form method="post" name="del" action="checkout.jsp">
                                    <input type="hidden" name="delid" value="" />
                                    <div class="rem">
                                        <button type="submit" class="close1"></button>
                                    </div>
                                </form>
                            </td>
                            <td class="invert"></td>
                            <td class="invert-image"><img style="height:120px;"  src="product-image/" alt=" " class="img-responsive"  /> </td>
                            <td class="invert">
                                <div class="quantity"> 
                                    <div class="quantity-select">                           
                                    </div>
                                    <form method="post"  action="checkout.jsp">
                                        <input type="hidden" name="updid" value="" />
                                        <input type="number"  name="qty" value="" />
                                        <input type="hidden" name="rate" value="" />
                                        <br>
                                        <div class="rem">
                                            <button type="submit" class="btn btn-info">Update</button>
                                        </div>
                                    </form>
                                </div>
                            </td>
                            <td class="invert">&#8377;  </td>
                            <td class="invert">&#8377; </td>
                        </tr>
                        <!--quantity-->
                        <script>
                            $('.value-plus').on('click', function () {
                                var divUpd = $(this).parent().find('.value'), newVal = parseInt(divUpd.text(), 10) + 1;
                                divUpd.text(newVal);
                            });

                            $('.value-minus').on('click', function () {
                                var divUpd = $(this).parent().find('.value'), newVal = parseInt(divUpd.text(), 10) - 1;
                                if (newVal >= 1)
                                    divUpd.text(newVal);
                            });
                        </script>
                        <!--quantity-->
                    </table>
                </div>
                <div class="checkout-left">	
                    <div class="checkout-right-basket animated wow slideInRight" data-wow-delay=".5s">
                        <a href="."><span class="glyphicon glyphicon-menu-left" aria-hidden="true"></span>Back To Shopping</a>
                        <a href="place-order.jsp">Place Order <span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span></a>
                    </div>
                    <div class="checkout-left-basket animated wow slideInLeft" data-wow-delay=".5s">
                        <h4>Shopping basket</h4>
                        <ul>
                            <li>Total <i >-</i>  <span>   &#8377;</span></li>
                            <li>Tax <i>-</i> <span>&#8377; </span></li>
                            <li>Grand Total <i>-</i> <span>&#8377;</span></li>
                        </ul>
                    </div>
                    <div class="clearfix"> </div>
                </div>
            </div>
        </div>	
        <%@include file="footer.jsp" %>
    </body>
</html>
