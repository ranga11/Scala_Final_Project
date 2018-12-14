// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Ranga Chari/Desktop/Scala Assignemnets/FINAL_Stock/Stock-Market-Prediction/conf/routes
// @DATE:Tue Dec 11 10:09:08 EST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def differences(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "differences")
    }
  
    // @LINE:16
    def createUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "signUp")
    }
  
    // @LINE:14
    def twitter(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "twitter")
    }
  
    // @LINE:11
    def userLogin(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:15
    def profit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "profit")
    }
  
    // @LINE:12
    def home(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "home")
    }
  
    // @LINE:10
    def recomendation(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "recomendation")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:19
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
