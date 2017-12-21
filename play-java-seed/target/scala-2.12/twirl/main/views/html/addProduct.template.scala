
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.62*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Product", user)/*5.27*/{_display_(Seq[Any](format.raw/*5.28*/("""
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
    
    """),_display_(/*20.6*/select(
        productForm("category.id"),
        options(Category.options),
        '_label -> "Category", '_default -> "-- Choose a category --",
        '_showConstraints -> false, 'class -> "form-control"
    )),format.raw/*25.6*/("""
    
    
    """),_display_(/*28.6*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*28.83*/("""
    """),_display_(/*29.6*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*29.83*/("""
    
    """),_display_(/*31.6*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*31.70*/("""
    
    """),format.raw/*33.5*/("""<div class="actions">
        <input type="submit" value="Add/Update Product" class-"btn btn-primary"> 
        <a href=""""),_display_(/*35.19*/routes/*35.25*/.HomeController.index(0)),format.raw/*35.49*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
""")))}),format.raw/*39.2*/("""

""")))}))
      }
    }
  }

  def render(productForm:Form[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(productForm,user)

  def f:((Form[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (productForm,user) => apply(productForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 21 22:41:44 GMT 2017
                  SOURCE: /home/wdd/webapps/WMDD1CoreDesignLab  (copy 1)/play-java-seed/app/views/addProduct.scala.html
                  HASH: 67ad6c9455d6af1eab6a83b799e07f2e96edab4b
                  MATRIX: 985->1|1118->64|1163->61|1191->80|1218->82|1251->107|1289->108|1320->113|1390->158|1430->190|1468->191|1503->200|1576->246|1590->251|1626->266|1667->279|1709->291|1742->298|1850->396|1890->397|1922->403|1935->407|1966->417|1999->424|2095->499|2127->505|2237->594|2274->605|2510->821|2552->837|2650->914|2682->920|2780->997|2817->1008|2902->1072|2939->1082|3088->1204|3103->1210|3148->1234|3280->1336
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|41->9|42->10|42->10|42->10|43->11|44->12|46->14|46->14|46->14|47->15|47->15|47->15|49->17|49->17|50->18|50->18|52->20|57->25|60->28|60->28|61->29|61->29|63->31|63->31|65->33|67->35|67->35|67->35|71->39
                  -- GENERATED --
              */
          