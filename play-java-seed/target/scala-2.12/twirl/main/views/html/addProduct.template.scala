
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.37*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Product")/*5.21*/{_display_(Seq[Any](format.raw/*5.22*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new product.</p>

    """),_display_(/*8.6*/if(flash.containsKey("success"))/*8.38*/{_display_(Seq[Any](format.raw/*8.39*/("""
        """),format.raw/*9.9*/("""<div class="alert alert-sucess">
            """),_display_(/*10.14*/flash/*10.19*/.get("success")),format.raw/*10.34*/("""
            """),format.raw/*11.13*/("""</div>
    """)))}),format.raw/*12.6*/("""

    """),_display_(/*14.6*/form(action=routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role-> "form")/*14.104*/{_display_(Seq[Any](format.raw/*14.105*/("""
    """),_display_(/*15.6*/CSRF/*15.10*/.formField),format.raw/*15.20*/("""

    """),_display_(/*17.6*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*17.81*/("""
    """),_display_(/*18.6*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*18.95*/("""
    """),_display_(/*19.6*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*19.83*/("""
    """),_display_(/*20.6*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*20.83*/("""
    
    """),_display_(/*22.6*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*22.70*/("""
    
    """),format.raw/*24.5*/("""<div class="actions">
        <input type="submit" value="Add/Update Product" class-"btn btn-primary"> 
        <a href=""""),_display_(/*26.19*/routes/*26.25*/.HomeController.index),format.raw/*26.46*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
""")))}),format.raw/*30.2*/("""

""")))}))
      }
    }
  }

  def render(productForm:Form[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(productForm)

  def f:((Form[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (productForm) => apply(productForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 08 08:58:45 GMT 2017
                  SOURCE: /home/wdd/webapps/WMDD1CoreDesignLab /play-java-seed/app/views/addProduct.scala.html
                  HASH: cba770b0b9b33bcd061130da44475b98df540a7e
                  MATRIX: 967->1|1075->39|1120->36|1148->55|1175->57|1202->76|1240->77|1271->82|1341->127|1381->159|1419->160|1454->169|1527->215|1541->220|1577->235|1618->248|1660->260|1693->267|1801->365|1841->366|1873->372|1886->376|1917->386|1950->393|2046->468|2078->474|2188->563|2220->569|2318->646|2350->652|2448->729|2485->740|2570->804|2607->814|2756->936|2771->942|2813->963|2945->1065
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|41->9|42->10|42->10|42->10|43->11|44->12|46->14|46->14|46->14|47->15|47->15|47->15|49->17|49->17|50->18|50->18|51->19|51->19|52->20|52->20|54->22|54->22|56->24|58->26|58->26|58->26|62->30
                  -- GENERATED --
              */
          