
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


Seq[Any](format.raw/*1.34*/("""

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
                  DATE: Tue Dec 11 10:09:10 EST 2018
                  SOURCE: C:/Users/Ranga Chari/Desktop/Scala Assignemnets/FINAL_Stock/Stock-Market-Prediction/app/views/helper/twitterBootstrapInput.scala.html
                  HASH: bfbc69cd6f861c4e22fc13ea6fb609926d323ea8
                  MATRIX: 766->1|893->33|923->224|953->228|1006->255|1036->277|1075->279|1111->285|1179->326|1196->334|1220->337|1250->340|1267->348|1294->354|1356->389|1373->397|1400->403|1433->409|1484->433|1501->441|1543->462|1580->473|1611->495|1651->497|1680->498|1730->521|1747->529|1790->551|1827->557|1858->561
                  LINES: 21->1|26->1|28->7|30->9|30->9|30->9|30->9|30->9|31->10|31->10|31->10|31->10|31->10|31->10|32->11|32->11|32->11|33->12|33->12|33->12|33->12|34->13|34->13|34->13|34->13|34->13|34->13|34->13|34->13|35->14
                  -- GENERATED --
              */
          