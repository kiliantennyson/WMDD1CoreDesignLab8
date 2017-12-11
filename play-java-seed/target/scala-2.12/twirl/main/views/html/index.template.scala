
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Product],List[models.Category],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.69*/("""

"""),_display_(/*3.2*/main("Products Page")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
  
  """),format.raw/*5.3*/("""<p class="lead">Product Catalogue</p>
  <div class="row">
      <div class=col-sm-2>
            <a href=""""),_display_(/*8.23*/routes/*8.29*/.HomeController.index(0)),format.raw/*8.53*/("""" class="list-group-item"> Categories </a>
              
                """),_display_(/*10.18*/for(c <- categories) yield /*10.38*/{_display_(Seq[Any](format.raw/*10.39*/("""
                  """),format.raw/*11.19*/("""<a href=""""),_display_(/*11.29*/routes/*11.35*/.HomeController.index(c.getId)),format.raw/*11.65*/("""" class="list-group-item"> """),_display_(/*11.93*/c/*11.94*/.getName),format.raw/*11.102*/("""
                      """),format.raw/*12.23*/("""<span class="badge"> """),_display_(/*12.45*/c/*12.46*/.getProducts.size()),format.raw/*12.65*/(""" """),format.raw/*12.66*/("""</span>
            </a>
                """)))}),format.raw/*14.18*/("""
      """),format.raw/*15.7*/("""</div>
    <div class="col-sm-10">
                

  <table class="table table-bordered table-hover table-condensed">
  
  <thead>
  
  <!-- The header row-->
  
  <tr>
  
  <th>ID</th>
  
  <th>Names</th>

  <th>Category</th>
  
  <th>Description</th>
  
  <th>Stock</th>
  
  <th>Price</th>

  
  </tr>
  
  </thead>
  
  <tbody>
  
  <!-- Product row(s) -->
  """),_display_(/*47.4*/for(p <-products) yield /*47.21*/{_display_(Seq[Any](format.raw/*47.22*/("""
  """),format.raw/*48.3*/("""<tr>
      <td>"""),_display_(/*49.12*/p/*49.13*/.getId),format.raw/*49.19*/("""</td>
      <td>"""),_display_(/*50.12*/p/*50.13*/.getName),format.raw/*50.21*/("""</td>
      <td>"""),_display_(/*51.12*/p/*51.13*/.getCategory.getName),format.raw/*51.33*/("""</td>
      <td>"""),_display_(/*52.12*/p/*52.13*/.getDescription),format.raw/*52.28*/("""</td>
      <td>"""),_display_(/*53.12*/p/*53.13*/.getStock),format.raw/*53.22*/("""</td>
      <td id="priceColumn">&euro; """),_display_(/*54.36*/("%.2f".format(p.getPrice))),format.raw/*54.63*/("""</td>
      <td>
        <a href=""""),_display_(/*56.19*/routes/*56.25*/.HomeController.updateProduct(p.getId)),format.raw/*56.63*/("""" class="button-xs btn danger">
          <img class="icon" src=""""),_display_(/*57.35*/routes/*57.41*/.Assets.versioned("images/edit.png")),format.raw/*57.77*/("""" alt="editIcon">          
        </a>
      </td>
      
      <td>
        <a href=""""),_display_(/*62.19*/routes/*62.25*/.HomeController.deleteProduct(p.getId)),format.raw/*62.63*/("""" class="button-xs btn danger" onclick="return confirmDel();">
          <img class="icon" src=""""),_display_(/*63.35*/routes/*63.41*/.Assets.versioned("images/bin.png")),format.raw/*63.76*/("""" alt="trashIcon">          
        </a>
      </td>
    </tr>

  """)))}),format.raw/*68.4*/("""
  
  """),format.raw/*70.3*/("""</tbody>
  
  </table>
  <a href=""""),_display_(/*73.13*/routes/*73.19*/.HomeController.addProduct()),format.raw/*73.47*/("""">
  <button type="button" class="btn btn-primary">Add a product</button>
  </a>

</div>
</div>


<br>
<br>
  """)))}))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category]): play.twirl.api.HtmlFormat.Appendable = apply(products,categories)

  def f:((List[models.Product],List[models.Category]) => play.twirl.api.HtmlFormat.Appendable) = (products,categories) => apply(products,categories)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 11 21:16:00 GMT 2017
                  SOURCE: /home/wdd/webapps/WMDD1CoreDesignLab  (copy 1)/play-java-seed/app/views/index.scala.html
                  HASH: f1f30bd24b2220012a9a670c7e3247389587b579
                  MATRIX: 984->1|1146->68|1174->71|1203->92|1242->94|1274->100|1407->207|1421->213|1465->237|1567->312|1603->332|1642->333|1689->352|1726->362|1741->368|1792->398|1847->426|1857->427|1887->435|1938->458|1987->480|1997->481|2037->500|2066->501|2139->543|2173->550|2565->916|2598->933|2637->934|2667->937|2710->953|2720->954|2747->960|2791->977|2801->978|2830->986|2874->1003|2884->1004|2925->1024|2969->1041|2979->1042|3015->1057|3059->1074|3069->1075|3099->1084|3167->1125|3215->1152|3277->1187|3292->1193|3351->1231|3444->1297|3459->1303|3516->1339|3632->1428|3647->1434|3706->1472|3830->1569|3845->1575|3901->1610|3999->1678|4032->1684|4094->1719|4109->1725|4158->1753
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|40->8|40->8|40->8|42->10|42->10|42->10|43->11|43->11|43->11|43->11|43->11|43->11|43->11|44->12|44->12|44->12|44->12|44->12|46->14|47->15|79->47|79->47|79->47|80->48|81->49|81->49|81->49|82->50|82->50|82->50|83->51|83->51|83->51|84->52|84->52|84->52|85->53|85->53|85->53|86->54|86->54|88->56|88->56|88->56|89->57|89->57|89->57|94->62|94->62|94->62|95->63|95->63|95->63|100->68|102->70|105->73|105->73|105->73
                  -- GENERATED --
              */
          