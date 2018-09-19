package com.luxoft.steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class StepsDefenitions {
    int distance =0;
    boolean isSean=true;

    @Given("^Lucy is in (\\d+) m from Sean$")
    public void lucyIsInMFromSean(int arg0) throws Throwable {
        distance=arg0;
        System.out.println("distance is "+distance + "\n");
    }

    @When("^Sean shouts 'Free bagel!'$")
    public void seanShoutsFreeBagel() throws Throwable {
        System.out.println("Sean shouts"+ "\n");
    }

    @Then("^Lucy hears Sean$")
    public void lucyHearsSean() throws Throwable {
        System.out.println("Lucy hears"+ "\n");
        Assert.assertTrue(distance<20);
    }

    @Then("^Lucy doesn't hear Sean$")
    public void lucyDoesnTHearSean() throws Throwable {
        System.out.println("Lucy doesn't hear Sean"+ "\n");
        Assert.assertTrue(distance>20);
    }

    @Given("^I have some setUp before the test$")
    public void iHaveSomeSetUpBeforeTheTest() throws Throwable {
        System.out.println("Preps"+ "\n");
    }

    @Given("^Lucy is in <distance> m from Sean$")
    public void lucyIsInDistanceMFromSean() throws Throwable {
        System.out.println("Lucy is in"+ "\n");
    }

    @When("^\"([^\"]*)\" shouts 'Free bagel!'$")
    public void shoutsFreeBagel(String arg0) throws Throwable {
        System.out.println(arg0 + " shouts from the cafe"+ "\n");
    }

    int number=0;
    @Given("^\"([^\"]*)\" is in (\\d+) meters from the cafe$")
    public void isInNumberMetersFromTheCafe(String arg0, int number) throws Throwable {
        this.number=number;
        System.out.println(arg0 + " is in " + number+ "\n");
    }

    @Then("^\"([^\"]*)\" (hears|not hears) the shout$")
    public void hearsTheShout(String arg0, String arg1) throws Throwable {
        if(arg1.equalsIgnoreCase("hears")){
            Assert.assertTrue(number<20);
            System.out.println(arg0 + " hears the shout");
        }
        else
        {Assert.assertTrue(number>20);
            System.out.println(arg0 + " doesn't hear the shout");}
    }

    @Given("^Lucy is far from smb$")
    public void lucyIsFarFromSmb(DataTable dt) {
        List<Map<String, String>> table =dt.asMaps(String.class, String.class);
        int i = table.size();
        for (int j=0; j<i; j++){
            distance=Integer.parseInt(table.get(j).get("distance"));
            if(!table.get(j).get("distance").equalsIgnoreCase("sean")){
                isSean=false;
            }
        }

    }

    @Given("^Lucy is far from smb from class$")
    public void lucyIsFarFromSmbFromClass(List<UserData> ud) throws Throwable {
        for (UserData anArg : ud){
            System.out.println(anArg.getDistance());
            System.out.println(anArg.getPerson());
            distance=anArg.getDistance();
            if(!anArg.getPerson().equalsIgnoreCase("sean")){
                isSean=false;
            }
        }
    }
}
