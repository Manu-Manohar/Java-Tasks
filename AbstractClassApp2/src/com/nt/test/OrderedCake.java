package com.nt.test;

class OrderedCake extends Cake
{
    private String message;

    
    public OrderedCake() 
    {
        super("Round", "Vanilla", 1);
        this.message = "";
    }


    public OrderedCake(String shape, String flavour, int qty) 
    {
        super(shape, flavour, qty);
        this.message = "";
    }

    
    public OrderedCake(String shape, String flavour, int qty, String message) 
    {
        super(shape, flavour, qty);
        this.message = message;
    }

    @Override
    public void showCake() {
        if (message != null && !message.isEmpty()) {
            System.out.println("A " + getShape() + " " + getFlavour() + " Cake of " + getQty() + " Kg/Kg's ready with message " + message + " @ Rs." + getPrice() + "/-");
        } else {
            super.showCake();
        }
    }
}

