
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

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

<li class="active"><a href="/">Products</a></li>

<li class="active"><a href="/customer">Customers</a></li>

<li><a href="#">Services</a></li>

<li><a href="#">Contact</a></li>

</ul>

</div>

</nav>

<container>

<div class="row">

<div class="col-md-12">

"""),_display_(/*57.2*/content),format.raw/*57.9*/("""

"""),format.raw/*59.1*/("""</div>

</div>

</container>

<container>

<div class="row">

<div class="col-md-12">

Copyright <strong>Online Shop</strong>

</div>

</div>

</container>
    <script src=""""),_display_(/*78.19*/routes/*78.25*/.Assets.versioned("javascripts/main.js")),format.raw/*78.65*/(""""></script>


</body>

</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 11 19:23:53 GMT 2017
                  SOURCE: /home/wdd/webapps/WMDD1CoreDesignLab  (copy 1)/play-java-seed/app/views/main.scala.html
                  HASH: 1fe7d93d0f1c62edc62754dd3a21cae2c2c11ebf
                  MATRIX: 952->1|1077->31|1105->33|1221->122|1247->127|1446->299|1461->305|1523->346|1585->381|1600->387|1665->431|2175->915|2202->922|2231->924|2432->1098|2447->1104|2508->1144
                  LINES: 28->1|33->1|35->3|43->11|43->11|49->17|49->17|49->17|50->18|50->18|50->18|89->57|89->57|91->59|110->78|110->78|110->78
                  -- GENERATED --
              */
          