package com.softserve.firsttask.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GrayBoxComponent {

    private WebElement grayBox;
    WebElement placeName;
    WebElement find;
    WebElement latitude;
    WebElement longitude;

    public GrayBoxComponent(WebElement grayBox) {
        this.grayBox = grayBox;
        initelements();
    }

    private void initelements() {
        placeName = grayBox.findElement(By.id("place"));
        find = grayBox.findElement(By.className("button"));
        latitude = grayBox.findElement(By.id("lat"));
        longitude = grayBox.findElement(By.id("lng"));
    }

    // Page Object

    // placeName

    public WebElement getPlaceName() {
        return placeName;
    }

    public String getPlaceNameText() {
        return getPlaceName().getText();
    }

    public void clickPlaceName() {
        getPlaceName().click();
    }

    public void setPlaceName(String name) {
        getPlaceName().sendKeys(name);
    }

    public void clearPlaceName() {
        getPlaceName().clear();
    }

    // find

    public WebElement getFind() {
        return find;
    }

    public String getFindText() {
        return getFind().getText();
    }

    public void clickFind() {
        getFind().click();
    }

    // latitude

    public WebElement getLatitude() {
        return latitude;
    }

    public String getLatitudeText() {
        return getLatitude().getText();
    }

    public void clickLatitude() {
        getLatitude().click();
    }

    // longitude

    public WebElement getLongitude() {
        return longitude;
    }

    public String getLongitudeText() {
        return getLongitude().getText();
    }

    public void clickLongitude() {
        getLongitude().click();
    }

    // Functional

    // Business Logic

}
