
package views.html.helper

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
import play.api.mvc._
import play.api.data._

object twitterBootstrapInput extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[helper.FieldElements,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elements: helper.FieldElements):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*7.3*/("""

"""),format.raw/*9.1*/("""<div class="control-group """),_display_(/*9.28*/if(elements.hasErrors)/*9.50*/ {_display_(Seq[Any](format.raw/*9.52*/("""error""")))}),format.raw/*9.58*/("""">
  <label class="control-label" for=""""),_display_(/*10.38*/elements/*10.46*/.id),format.raw/*10.49*/("""">"""),_display_(/*10.52*/elements/*10.60*/.label),format.raw/*10.66*/("""</label>
  <div class="controls">"""),_display_(/*11.26*/elements/*11.34*/.input),format.raw/*11.40*/("""
    """),format.raw/*12.5*/("""<p class="help-inline">"""),_display_(/*12.29*/elements/*12.37*/.infos.mkString(", ")),format.raw/*12.58*/("""</p>
    """),_display_(/*13.6*/if(elements.hasErrors)/*13.28*/ {_display_(Seq[Any](format.raw/*13.30*/(""" """),format.raw/*13.31*/("""<p class="help-block">"""),_display_(/*13.54*/elements/*13.62*/.errors.mkString(", ")),format.raw/*13.84*/("""</p> """)))}),format.raw/*13.90*/("""
  """),format.raw/*14.3*/("""</div>
</div>"""))
      }
    }
  }

  def render(elements:helper.FieldElements): play.twirl.api.HtmlFormat.Appendable = apply(elements)

  def f:((helper.FieldElements) => play.twirl.api.HtmlFormat.Appendable) = (elements) => apply(elements)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 15 00:40:49 EST 2018
                  SOURCE: /Users/vinyaskaushiktr/Downloads/scalaproject/Scala_Final_Project/Stock-Market-Prediction/app/views/helper/twitterBootstrapInput.scala.html
                  HASH: 496fe6dce58ebe17b2f0b852bf8ffd83d07ad7ab
                  MATRIX: 766->1|892->34|919->218|947->220|1000->247|1030->269|1069->271|1105->277|1172->317|1189->325|1213->328|1243->331|1260->339|1287->345|1348->379|1365->387|1392->393|1424->398|1475->422|1492->430|1534->451|1570->461|1601->483|1641->485|1670->486|1720->509|1737->517|1780->539|1817->545|1847->548
                  LINES: 21->1|26->2|27->7|29->9|29->9|29->9|29->9|29->9|30->10|30->10|30->10|30->10|30->10|30->10|31->11|31->11|31->11|32->12|32->12|32->12|32->12|33->13|33->13|33->13|33->13|33->13|33->13|33->13|33->13|34->14
                  -- GENERATED --
              */
          