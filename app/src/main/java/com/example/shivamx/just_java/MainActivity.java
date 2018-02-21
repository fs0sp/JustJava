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
import android.widget.CheckBox;
import android.widget.EditText;
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
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }

    /**
     *
     * @return total price
     */

    public int calculatePrice(){

        return quantity * 5;
    }

    /**
     *
     * @param view
     */

    public void submitOrder(View view) {

        EditText nameField = (EditText) findViewById(R.id.name_field);
        String value = nameField.getText().toString();

        CheckBox whippedCreamCheckbox = (CheckBox) findViewById(R.id.whipped_cream_checkbox);
        boolean hasWhippedCream = whippedCreamCheckbox.isChecked();

        CheckBox chocolateCheckBox = (CheckBox) findViewById(R.id.chocolate_checkbox);
        boolean hasChocolate = chocolateCheckBox.isChecked();

        int price = calculatePrice();
        displayMessage(createOrderSummary(price, hasWhippedCream, hasChocolate, value));

    }

    /**
     *
     * @param price total price of order
     * @param addWhippedCream whether user want whipped cream or not
     * @return order summary
     */

    private String createOrderSummary(int price, boolean addWhippedCream, boolean addChocolate, String name){


       String priceMessage = "Name :" + name + "\n ";
        priceMessage = priceMessage + "Add Whipped Cream? " + addWhippedCream;
        priceMessage = priceMessage + "\nAdd Chocolate? " + addChocolate;
        priceMessage = priceMessage + "\nQuantity : " + quantity ;
        priceMessage = priceMessage + " \n Total: $ " + price + " \n Thank You! ";

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

