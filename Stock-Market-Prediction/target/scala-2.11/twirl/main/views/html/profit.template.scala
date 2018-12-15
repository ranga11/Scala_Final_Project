
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
import play.api.mvc._
import play.api.data._

object profit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<meta charset="utf-8">
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, shrink-to-fit=no, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title></title>

        <!-- Bootstrap Core CSS -->
    <link href="/assets/stylesheets/bootstrap.css" rel="stylesheet">

        <!-- Custom CSS -->
    <link href="/assets/stylesheets/simple-sidebar.css" rel="stylesheet">
        <link href="/assets/stylesheets/heroic-features.css" rel="stylesheet">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>

        <![endif]-->
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.min.js"></script>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>

</head>
<style> /* set the CSS */



.bar--positive """),format.raw/*34.16*/("""{"""),format.raw/*34.17*/("""
    """),format.raw/*35.5*/("""fill: steelblue;
"""),format.raw/*36.1*/("""}"""),format.raw/*36.2*/("""

"""),format.raw/*38.1*/(""".bar--negative """),format.raw/*38.16*/("""{"""),format.raw/*38.17*/("""
    """),format.raw/*39.5*/("""fill: darkorange;
"""),format.raw/*40.1*/("""}"""),format.raw/*40.2*/("""

"""),format.raw/*42.1*/(""".axis text """),format.raw/*42.12*/("""{"""),format.raw/*42.13*/("""
    """),format.raw/*43.5*/("""font: 10px sans-serif;
"""),format.raw/*44.1*/("""}"""),format.raw/*44.2*/("""

"""),format.raw/*46.1*/(""".axis path,
.axis line """),format.raw/*47.12*/("""{"""),format.raw/*47.13*/("""
    """),format.raw/*48.5*/("""fill: none;
    stroke: #000;
    shape-rendering: crispEdges;
"""),format.raw/*51.1*/("""}"""),format.raw/*51.2*/("""
"""),format.raw/*52.1*/("""</style>
<body>

    <div id="wrapper">

            <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                    <a href="#">
                        Stock Analysis
                    </a>
                </li>
                <li>
                    <a href="#" id="showDashboard">Dashboard Analysis</a>
                </li>
                <li>
                    <a href="recomendation" id="showRecommendation">Company Listing</a>
                </li>
                <li>
                    <a href="differences" id="showDifference">Past V/S Future</a>
                </li>
                <li>
                    <a href="twitter" id="">Twitter Analysis</a>
                </li>
                <li>
                    <a href="profit" id="">Profit Analysis</a>
                </li>
            </ul>
        </div>
            <!-- /#sidebar-wrapper -->

            <!-- Page Content -->
        <div id="page-content-wrapper">
            <div class="container-fluid">
                <div class="row" id="graphs">
                    <div class="col-lg-12">
                        <div id="recommendation" >
                            <h1>You can see the most profitable Stocks !!</h1>
                            <div class="form-group">


                                <div id="b">


                                </div>

                                <br>


                            </div>
                        </div>

                    </div>
                </div>
                    <!-- /#page-content-wrapper -->

            </div>
        </div>
    </div>
</body>

    <!-- load the d3.js library -->
<script type=
"text/javascript" src="http://d3js.org/d3.v3.min.js">
</script>

<script src="/assets/javascripts/profit.js"></script>

<script src="/assets/javascripts/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
<script src="/assets/javascripts/bootstrap.min.js"></script>

    <!-- Menu Toggle Script -->
<script>
                $(document).ready(function() """),format.raw/*128.46*/("""{"""),format.raw/*128.47*/("""
                    """),format.raw/*129.21*/("""$("#wrapper").toggleClass("toggled");
                """),format.raw/*130.17*/("""}"""),format.raw/*130.18*/(""");

        </script>



"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 15 00:40:49 EST 2018
                  SOURCE: /Users/vinyaskaushiktr/Downloads/scalaproject/Scala_Final_Project/Stock-Market-Prediction/app/views/profit.scala.html
                  HASH: 4c898352672a2b4608aab31ab209f5b617f141bf
                  MATRIX: 812->0|1995->1155|2024->1156|2056->1161|2100->1178|2128->1179|2157->1181|2200->1196|2229->1197|2261->1202|2306->1220|2334->1221|2363->1223|2402->1234|2431->1235|2463->1240|2513->1263|2541->1264|2570->1266|2621->1289|2650->1290|2682->1295|2772->1358|2800->1359|2828->1360|4974->3477|5004->3478|5054->3499|5137->3553|5167->3554
                  LINES: 26->1|59->34|59->34|60->35|61->36|61->36|63->38|63->38|63->38|64->39|65->40|65->40|67->42|67->42|67->42|68->43|69->44|69->44|71->46|72->47|72->47|73->48|76->51|76->51|77->52|153->128|153->128|154->129|155->130|155->130
                  -- GENERATED --
              */
          