
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),_display_(/*3.2*/main("Products Page")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
  
  """),format.raw/*5.3*/("""<p class="lead">Product Catalogue</p>
  
  <table class="table table-bordered table-hover table-condensed">
  
  <thead>
  
  <!-- The header row-->
  
  <tr>
  
  <th>ID</th>
  
  <th>Name</th>
  
  <th>Description</th>
  
  <th>Stock</th>
  
  <th>Price</th>
  
  </tr>
  
  </thead>
  
  <tbody>
  
  <!-- Product row(s) -->
  """),_display_(/*32.4*/for(p <-products) yield /*32.21*/{_display_(Seq[Any](format.raw/*32.22*/("""
  """),format.raw/*33.3*/("""<tr>
      <td>"""),_display_(/*34.12*/p/*34.13*/.getId),format.raw/*34.19*/("""</td>
      <td>"""),_display_(/*35.12*/p/*35.13*/.getName),format.raw/*35.21*/("""</td>
      <td>"""),_display_(/*36.12*/p/*36.13*/.getDescription),format.raw/*36.28*/("""</td>
      <td>"""),_display_(/*37.12*/p/*37.13*/.getStock),format.raw/*37.22*/("""</td>
      <td id="priceColumn">&euro; """),_display_(/*38.36*/("%.2f".format(p.getPrice))),format.raw/*38.63*/("""</td>
      <td>
        <a href=""""),_display_(/*40.19*/routes/*40.25*/.HomeController.deleteProduct(p.getId)),format.raw/*40.63*/("""" class="button-xs btn danger" onclick="return confirmDel();">
          <img class="icon" src=""""),_display_(/*41.35*/routes/*41.41*/.Assets.versioned("images/bin.png")),format.raw/*41.76*/("""" alt="trashIcon">          
        </a>
      </td>
  </tr>

  """)))}),format.raw/*46.4*/("""
  
  """),format.raw/*48.3*/("""</tbody>
  
  </table>
  <a href=""""),_display_(/*51.13*/routes/*51.19*/.HomeController.addProduct()),format.raw/*51.47*/("""">
  <button type="button" class="btn btn-primary">Add a product</button>
  </a>


<br>
<br>
  """)))}))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 08 12:36:36 GMT 2017
                  SOURCE: /home/wdd/webapps/WMDD1CoreDesignLab /play-java-seed/app/views/index.scala.html
                  HASH: 467338f239b4539606aa579d32df026fc0829673
                  MATRIX: 962->1|1089->33|1117->36|1146->57|1185->59|1217->65|1574->396|1607->413|1646->414|1676->417|1719->433|1729->434|1756->440|1800->457|1810->458|1839->466|1883->483|1893->484|1929->499|1973->516|1983->517|2013->526|2081->567|2129->594|2191->629|2206->635|2265->673|2389->770|2404->776|2460->811|2556->877|2589->883|2651->918|2666->924|2715->952
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|64->32|64->32|64->32|65->33|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|72->40|72->40|72->40|73->41|73->41|73->41|78->46|80->48|83->51|83->51|83->51
                  -- GENERATED --
              */
          