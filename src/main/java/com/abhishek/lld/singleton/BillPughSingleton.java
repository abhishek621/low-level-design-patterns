package com.abhishek.lld.singleton;

public class BillPughSingleton {

	private BillPughSingleton() {
        // Initialization code here
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
