
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>

<meta charset="utf-8">

<title>Online Shop - """),_display_(/*11.23*/title),format.raw/*11.28*/("""</title>

<!-- Bootstrap Core CSS -->

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />

<!-- Custom CSS --> <link href=""""),_display_(/*17.34*/routes/*17.40*/.Assets.versioned("stylesheets/main.css")),format.raw/*17.81*/("""" rel="stylesheet" />
<link href=""""),_display_(/*18.14*/routes/*18.20*/.Assets.versioned("stylesheets/numeric.css")),format.raw/*18.64*/("""" rel="stylesheet" />


</head>

<body>

<nav class="navbar navbar-inverse">

<div class="container-fluid">

<div class="navbar-header">

<a class="navbar-brand" href="#">Online Shop</a>

</div>

<ul class="nav navbar-nav">

<li """),_display_(/*37.6*/if(title=="Products Page")/*37.32*/{_display_(Seq[Any](format.raw/*37.33*/("""class="active"""")))}),format.raw/*37.48*/("""><a href=""""),_display_(/*37.59*/routes/*37.65*/.HomeController.index()),format.raw/*37.88*/("""">Products</a></li>

<li """),_display_(/*39.6*/if(title=="Customer")/*39.27*/{_display_(Seq[Any](format.raw/*39.28*/("""class="active"""")))}),format.raw/*39.43*/("""class="active"><a href="/customer">Customers</a></li>

<li><a href="#">Services</a></li>

<li><a href="#">Contact</a></li>

<li """),_display_(/*45.6*/if(title=="Login")/*45.24*/{_display_(Seq[Any](format.raw/*45.25*/("""class="active"""")))}),format.raw/*45.40*/(""">
  """),_display_(/*46.4*/if(user != null)/*46.20*/{_display_(Seq[Any](format.raw/*46.21*/("""
    """),format.raw/*47.5*/("""<a href=""""),_display_(/*47.15*/routes/*47.21*/.LoginController.logout()),format.raw/*47.46*/("""">Logout """),_display_(/*47.56*/user/*47.60*/.getName()),format.raw/*47.70*/(""" """),format.raw/*47.71*/("""</a>
  """)))}/*48.5*/else/*48.10*/{_display_(Seq[Any](format.raw/*48.11*/("""
    """),format.raw/*49.5*/("""<a href=""""),_display_(/*49.15*/routes/*49.21*/.LoginController.login()),format.raw/*49.45*/("""">Login </a>    
  """)))}),format.raw/*50.4*/("""
"""),format.raw/*51.1*/("""</li>


</ul>

</div>

</nav>

<container>

<div class="row">

<div class="col-md-12">

"""),_display_(/*66.2*/content),format.raw/*66.9*/("""

"""),format.raw/*68.1*/("""</div>

</div>

</container>

<container>

<div class="row">

<div class="col-md-12">

Copyright <strong>Online Shop</strong>

</div>

</div>

</container>
    <script src=""""),_display_(/*87.19*/routes/*87.25*/.Assets.versioned("javascripts/main.js")),format.raw/*87.65*/(""""></script>


</body>

</html>"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 21 23:28:39 GMT 2017
                  SOURCE: /home/wdd/webapps/WMDD1CoreDesignLab  (copy 1)/play-java-seed/app/views/main.scala.html
                  HASH: 1acbd5fae41a02697f5f0a53806e7dd73bc3cf7b
                  MATRIX: 970->1|1120->56|1148->58|1264->147|1290->152|1489->324|1504->330|1566->371|1628->406|1643->412|1708->456|1964->686|1999->712|2038->713|2084->728|2122->739|2137->745|2181->768|2233->794|2263->815|2302->816|2348->831|2503->960|2530->978|2569->979|2615->994|2646->999|2671->1015|2710->1016|2742->1021|2779->1031|2794->1037|2840->1062|2877->1072|2890->1076|2921->1086|2950->1087|2976->1096|2989->1101|3028->1102|3060->1107|3097->1117|3112->1123|3157->1147|3207->1167|3235->1168|3350->1257|3377->1264|3406->1266|3607->1440|3622->1446|3683->1486
                  LINES: 28->1|33->1|35->3|43->11|43->11|49->17|49->17|49->17|50->18|50->18|50->18|69->37|69->37|69->37|69->37|69->37|69->37|69->37|71->39|71->39|71->39|71->39|77->45|77->45|77->45|77->45|78->46|78->46|78->46|79->47|79->47|79->47|79->47|79->47|79->47|79->47|79->47|80->48|80->48|80->48|81->49|81->49|81->49|81->49|82->50|83->51|98->66|98->66|100->68|119->87|119->87|119->87
                  -- GENERATED --
              */
          