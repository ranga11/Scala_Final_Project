
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

object differences extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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



path """),format.raw/*34.6*/("""{"""),format.raw/*34.7*/("""
    """),format.raw/*35.5*/("""stroke: steelblue;
    stroke-width: 2;
    fill: none;
"""),format.raw/*38.1*/("""}"""),format.raw/*38.2*/("""

"""),format.raw/*40.1*/(""".axis path,
.axis line """),format.raw/*41.12*/("""{"""),format.raw/*41.13*/("""
    """),format.raw/*42.5*/("""fill: none;
    stroke: grey;
    stroke-width: 1;
    shape-rendering: crispEdges;
"""),format.raw/*46.1*/("""}"""),format.raw/*46.2*/("""

"""),format.raw/*48.1*/("""</style>
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
                        <h1>You can see the Difference!!</h1>
                        <div class="form-group">
                            <div id="option">
                                <input name="updateButton"
                                type="button"
                                value="Predicted"
                                onclick="updateData()" />
                            </div>
                            <br>
                            <div id="option">
                                <input name="updateButton"
                                type="button"
                                value="Actual     "
                                onclick="previousData()" />
                            </div>

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

<script src="/assets/javascripts/differences.js"></script>


<script src="/assets/javascripts/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
<script src="/assets/javascripts/bootstrap.min.js"></script>

    <!-- Menu Toggle Script -->
<script>
                $(document).ready(function() """),format.raw/*135.46*/("""{"""),format.raw/*135.47*/("""
                    """),format.raw/*136.21*/("""$("#wrapper").toggleClass("toggled");
                """),format.raw/*137.17*/("""}"""),format.raw/*137.18*/(""");

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
                  SOURCE: /Users/vinyaskaushiktr/Downloads/scalaproject/Scala_Final_Project/Stock-Market-Prediction/app/views/differences.scala.html
                  HASH: 03766f3ed26e94376bceed2fb7a955a81ac0b152
                  MATRIX: 817->0|1996->1152|2024->1153|2056->1158|2139->1214|2167->1215|2196->1217|2247->1240|2276->1241|2308->1246|2419->1330|2447->1331|2476->1333|5051->3879|5081->3880|5131->3901|5214->3955|5244->3956
                  LINES: 26->1|59->34|59->34|60->35|63->38|63->38|65->40|66->41|66->41|67->42|71->46|71->46|73->48|160->135|160->135|161->136|162->137|162->137
                  -- GENERATED --
              */
          