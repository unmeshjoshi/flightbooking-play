package controllers

import play.api.mvc._

object FlightSearchController extends Controller {
  
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  
}