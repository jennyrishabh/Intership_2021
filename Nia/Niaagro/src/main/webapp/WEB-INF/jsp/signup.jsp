<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
     <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    <%@ taglib prefix="mo" uri="http://www.springframework.org/tags/form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign_up</title>

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<style>

.note
{
    text-align: center;
    height: 20px;
    background: -webkit-linear-gradient(left, #0072ff, #8811c5);
    color: #fff;
    font-weight: bold;
    line-height: 20px;
}
.form-content
{
    padding: 5%;
    border: 1px solid #ced4da;
    margin-bottom: 2%;
}
.form-control{
    border-radius:1.5rem;
}
.btnSubmit
{
    border:none;
    border-radius:1.5rem;
    padding: 1%;
    width: 20%;
    cursor: pointer;
    background: #0062cc;
    color: #fff;
}

input {
    margin: .4rem;
}

.error{
      padding: 0 30px 0 50px;
      /*color: #999;*/
       font-size: 16px;
      max-height: 0;
      transition: 0.28s;
      overflow: hidden;
      color: red;
      font-style: italic;
    } 


</style>
</head>
<body>

<mo:form action="signupProcessing" method="post" modelAttribute="model">
<div class="container register-form">
            <div class="form">
                <div class="note">
                    <p>Signup</p>
                </div>
                
                
                <div class="form-content">
                    <div class="row">
                        <div class="col-md-4">
                            <div class="form-group">Name :
                                <mo:input path="name" type="text" class="form-control" placeholder="Your Name *" value=""/>
                                <mo:errors path="name" cssClass="error"/>
                            </div>
                             <div class="form-group">State : <br />
                                <!-- <input type="text" class="form-control" placeholder="state" value=""/> -->
                                <mo:select path="state" name = "State">  
                               <option value = "null"> --SELECT-- </option>   
                                <option value = "Telangana"> Telangana </option>   
                                 <option value = "Andaman And Nicobar Islands"> Andaman And Nicobar Islands </option>  
                                 <option value = "Andhra Pradesh"> Andhra Pradesh </option>  
                                 <option value = "Arunachal Pradesh"> Arunachal Pradesh </option>  
                                 <option value = "Assam"> Assam </option>  
                                 <option value = "Bihar"> Bihar </option>  
                                 <option value = "Chandigarh"> Chandigarh </option>  
                                 <option value = "Chhattisgarh"> Chhattisgarh </option>  
                                 <option value = "Dadra And Nagar Haveli"> Dadra And Nagar Haveli </option>  
                                 <option value = "Daman And Diu "> Daman And Diu  </option>  
                                 <option value = "Delhi"> Delhi </option>  
                                 <option value = "Goa"> Goa </option>  
                                 <option value = "Gujarat"> Gujarat </option>  
                                 <option value = "Haryana"> Haryana </option>  
                                 <option value = "Himachal Pradesh"> Himachal Pradesh </option>  
                                 <option value = "Jammu And Kashmir"> Jammu And Kashmir </option>  
                                 <option value = "Jharkhand"> Jharkhand </option>  
                                 <option value = "Karnataka"> Karnataka </option>  
                                 <option value = "Kerala"> Kerala </option>  
                                 <option value = "Lakshadweep"> Lakshadweep </option>  
                                 <option value = "Madhya Pradesh"> Madhya Pradesh </option>  
                                 <option value = "Maharashtra"> Maharashtra </option>  
                                 <option value = "Manipur"> Manipur </option>  
                                 <option value = "Meghalaya"> Meghalaya </option>  
                                 <option value = "Mizoram"> Mizoram </option>  
                                <option value = "Nagaland "> Nagaland  </option>  
                                 <option value = "Odisha"> Odisha </option>  
                                <option value = "Pondicherry "> Pondicherry  </option>  
                                 <option value = "Punjab"> Punjab </option>  
                                 <option value = "Rajasthan"> Rajasthan </option>  
                                 <option value = "Sikkim"> Sikkim </option>  
                                 <option value = "Tamil Nadu"> Tamil Nadu </option>  
                                 <option value = "Tripura"> Tripura </option>  
                                  <option value = "Uttarakhand"> Uttarakhand </option>  
                                  <option value = "Uttar Pradesh"> Uttar Pradesh </option>  
                                  <option value = "West Bengal"> West Bengal </option>  
                                </mo:select> 
                                <mo:errors path="state" cssClass="error"/>  
                            </div>
                            <div class="form-group">Phone number :
                                <mo:input path="phne" type="text" class="form-control" placeholder="Phone Number *" value=""/>
                                <mo:errors path="phne" cssClass="error"/>
                            </div>
                        
                             <div class="form-group">Password : (min 6 characters)
                                <mo:input path="pwd1" type="text" class="form-control" placeholder="Your Password *" value=""/>
                                <mo:errors path="pwd1" cssClass="error"/>
                            </div>
                             <div class="form-group">Gst Number : 
                                <mo:input path="Gst_number" type="text" class="form-control" placeholder="GST number" value=""/>
                                <mo:errors path="Gst_number" cssClass="error"/>
                            </div>
                        </div>
                        <div class="col-md-4">
                             <div class="form-group">Company Name : 
                                <mo:input path="comp_name" type="text" class="form-control" placeholder="Company name * " value=""/>
                                 <mo:errors path="comp_name" cssClass="error"/>
                            </div>
                             <div class="form-group">
                                <!-- <input type="text" class="form-control" placeholder="city" value=""/> --> 
                            <div class="form-group">City :<br /> 
                                <!-- <input type="text" class="form-control" placeholder="state" value=""/> -->
                                <mo:select path="city" name = "State">  
                               <option value = "null"> --SELECT-- </option>   
                                <option value = "delhi"> delhi </option> 
                                <option value = "gwalior"> gwalior</option>  
                                </mo:select> 
                                <mo:errors path="city" cssClass="error"/>  
                            </div>
                            </div>
                             <div class="form-group">Email id : 
                                <mo:input path="emailid" type="text" class="form-control" placeholder="email id * " value=""/>
                                <mo:errors path="emailid" cssClass="error"/>
                            </div>
                            <div class="form-group">Confirm Password : 
                                <mo:input path="pwd1" type="text" class="form-control" placeholder="Confirm Password *" value=""/>
                                <mo:errors path="pwd2" cssClass="error"/>
                            </div>
                             <div class="form-group">Address : 
                                <mo:input path="address" type="text" class="form-control" placeholder="Address *" value=""/>
                                <mo:errors path="address" cssClass="error"/>
                            </div>
                        </div>
                        
                        
                     
                        <div class="col-md-4">
                             <div class="form-group">buyer type : <br />
                                <div>
                                     <label for="Bird watching">Trader(Buyer)</label>
									<mo:radiobutton path="buyer_type" id="Bird watching" value="Trader"/>
									 <mo:errors path="buyer_type" cssClass="error"/> 
									<label for="Astronomy">Manufacture</label>
									<mo:radiobutton path="buyer_type" id="Astronomy" value="Manufacture"/>
									<mo:errors path="buyer_type" cssClass="error"/> <br /><br />
									  
                                </div>
                             <div class="form-group">office landline :  
                                <mo:input path="office_landline" type="text" class="form-control" placeholder="Your office landline" value=""/>
                                 <mo:errors path="office_landline" cssClass="error"/> 
                            </div>
                             <div class="form-group">Products manufactured : 
                                <mo:input path="products_manufactured" type="text" class="form-control" placeholder="Your Products " value=""/>
                                 <mo:errors path="products_manufactured" cssClass="error"/> 
                            </div>
                            <div class="form-group">Website : 
                                <mo:input path="website" type="text" class="form-control" placeholder="Your Website" value=""/>
                                <mo:errors path="website" cssClass="error"/> 
                            </div>
                        </div>
                   
                    
                         <div  class="form-group">
							<mo:checkbox path="checkbox" id="Bird watching" value="true"/> 
							<label for="Bird watching">Accept Terms &amp; Conditions*</label><br />
                             <mo:errors path="checkbox" cssClass="error"/> 
                         </div>
                       <mo:button style="width: 250px; margin:margin-left: 80%" class="btnSubmit">Join Now</mo:button>
           
                    
                    
                
            </div>
        </div>
</mo:form>

</body>
</html>