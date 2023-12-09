package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into
    // simple lines of code...

    public String whileLoop() {
        StringBuilder result = new StringBuilder();
        int counter = 0;
        // while `counter` is less than length of array
        while (counter< personArray.length){
            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            result.append(personArray[counter].toString());

            counter++;
        }

        return result.toString();
    }



    public String forLoop() {
        StringBuilder result = new StringBuilder();
        //String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
        for(int i =0; i< personArray.length; i++){
            // use the above clauses to declare for-loop signature
            // begin loop
            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            result.append(personArray[i].toString());
            // end loop
        }
        return result.toString();
    }



    public String forEachLoop() {
        StringBuilder result = new StringBuilder();
        //String result = "";
        // identify array's type
        // identify array's variable-name
        for (Person p : personArray) {
            // use the above discoveries to declare for-each-loop signature
            // begin loop
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            result.append(p.toString());
            // end loop

        }
        // use the above discoveries to declare for-each-loop signature
        // begin loop
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop

        return result.toString();
    }


//    public Person[] getPersonArray() {
//        return personArray;
//    }
}
