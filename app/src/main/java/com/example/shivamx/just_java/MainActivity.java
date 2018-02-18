/**
 * IMPORTANT: Make sure you are using the correct package name. 
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.shivamx.just_java;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    /**
     *
     * @return total price
     */

    public int calculatePrice(){

        return quantity * 5;
    }

    public void submitOrder(View view) {

        int price = calculatePrice();
        displayMessage(createOrderSummary(price));

    }

    private String createOrderSummary(int price){


       String priceMessage = "Name : Shivam Pokhriyal \n ";
        priceMessage = priceMessage + "Quantity : " + quantity ;
        priceMessage = priceMessage + " \n Total: $ " + price + " \n Thank You! "  ;

        return priceMessage;
    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }



    public void increment(View view) {

        //int quantity = 3;
        quantity = quantity + 1;
        displayQuantity(quantity);


      //  displayPrice(quantity * 5);
    }

    public void decrement(View view) {

        //int quantity = 2;
        quantity = quantity -1;
        displayQuantity(quantity);
       // displayPrice(numberOfCoffee * 5);
    }

}

