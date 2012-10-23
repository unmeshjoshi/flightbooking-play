package controllers

import play.api.mvc._

object FlightSearchController extends Controller {
  
  def index = Action {
    Ok(views.html.FlightSearchController.index())
  }

  def submit = Action {
    Ok(views.html.FlightSearchController.index())
  }
  
}