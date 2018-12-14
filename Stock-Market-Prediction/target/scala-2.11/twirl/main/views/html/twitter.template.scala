
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

object twitter extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
        <!--<link href="/assets/stylesheets/heroic-features.css" rel="stylesheet">-->

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>

        <![endif]-->
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.min.js"></script>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>

</head>
<style> /* set the CSS */
.axis text """),format.raw/*31.12*/("""{"""),format.raw/*31.13*/("""
    """),format.raw/*32.5*/("""font: 10px sans-serif;
"""),format.raw/*33.1*/("""}"""),format.raw/*33.2*/("""

"""),format.raw/*35.1*/(""".axis path,
.axis line """),format.raw/*36.12*/("""{"""),format.raw/*36.13*/("""
    """),format.raw/*37.5*/("""fill: none;
    stroke: #000;
    shape-rendering: crispEdges;
"""),format.raw/*40.1*/("""}"""),format.raw/*40.2*/("""

"""),format.raw/*42.1*/(""".bar """),format.raw/*42.6*/("""{"""),format.raw/*42.7*/("""
    """),format.raw/*43.5*/("""fill: steelblue;
    fill-opacity: .9;
"""),format.raw/*45.1*/("""}"""),format.raw/*45.2*/("""

"""),format.raw/*47.1*/(""".x.axis path """),format.raw/*47.14*/("""{"""),format.raw/*47.15*/("""
    """),format.raw/*48.5*/("""display: none;
"""),format.raw/*49.1*/("""}"""),format.raw/*49.2*/("""

"""),format.raw/*51.1*/("""label """),format.raw/*51.7*/("""{"""),format.raw/*51.8*/("""
    """),format.raw/*52.5*/("""position: absolute;
    top: 10px;
    right: 10px;
"""),format.raw/*55.1*/("""}"""),format.raw/*55.2*/("""

"""),format.raw/*57.1*/("""</style>
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
                            <h1>Twitter Live Sentiment Analysis </h1>
                            <div class="form-group">


                                <div id="b">
                                    <label><input type="checkbox"> Sort values</label>

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

<script src="/assets/javascripts/twitter.js"></script>

<script src="/assets/javascripts/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
<script src="/assets/javascripts/bootstrap.min.js"></script>

    <!-- Menu Toggle Script -->
<script>
                $(document).ready(function() """),format.raw/*132.46*/("""{"""),format.raw/*132.47*/("""
                    """),format.raw/*133.21*/("""$("#wrapper").toggleClass("toggled");
                """),format.raw/*134.17*/("""}"""),format.raw/*134.18*/(""");

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
                  DATE: Fri Dec 14 14:00:21 EST 2018
                  SOURCE: C:/Users/Ranga Chari/Desktop/Scala Assignemnets/FINAL_Stock/Stock-Market-Prediction/app/views/twitter.scala.html
                  HASH: 8dac2802f4751498e8c01d52b76e5811409afd8a
                  MATRIX: 813->0|2026->1185|2055->1186|2088->1192|2139->1216|2167->1217|2198->1221|2250->1245|2279->1246|2312->1252|2405->1318|2433->1319|2464->1323|2496->1328|2524->1329|2557->1335|2625->1376|2653->1377|2684->1381|2725->1394|2754->1395|2787->1401|2830->1417|2858->1418|2889->1422|2922->1428|2950->1429|2983->1435|3065->1490|3093->1491|3124->1495|5415->3757|5445->3758|5496->3780|5580->3835|5610->3836
                  LINES: 26->1|56->31|56->31|57->32|58->33|58->33|60->35|61->36|61->36|62->37|65->40|65->40|67->42|67->42|67->42|68->43|70->45|70->45|72->47|72->47|72->47|73->48|74->49|74->49|76->51|76->51|76->51|77->52|80->55|80->55|82->57|157->132|157->132|158->133|159->134|159->134
                  -- GENERATED --
              */
          