package com.qa.stepDefinations;



import org.testng.Assert;

import com.qa.test.SearchPage;
import com.qa.util.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPageSteps extends TestBase {
	
	SearchPage search;
	

@Given("user opens browser")
public void user_opens_browser() {
    TestBase.initialization();
    
}


@When("user in on search page")
public void user_in_on_search_page() {
	search=new SearchPage();
	String expc=prop.getProperty("searchpage");
	String titel=search.validateSearch();
    Assert.assertEquals(titel, expc);
	
  
}


@Then("user enter the searching value")
public void user_enter_the_searching_value() {
	
	 search.Searching(prop.getProperty("data"));
}





@Then("searched item is displyed")
public void searched_item_is_displyed() {
	
	String expcepted=prop.getProperty("searchedpage");
	String titel1=search.validateSearchedPage();
    Assert.assertEquals(titel1, expcepted);
   
}


@Then("print the items name and original value and discounted value")
public void print_the_items_name() {
	search.Searched();
   
}



@Then("Print the name of the item whose Original value is highest")
public void print_the_name_of_the_item_whose_original_value_is_highest() {
    search.maxPriceItem();
}





	
	

}
