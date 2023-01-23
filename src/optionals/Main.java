package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Integer number = 5;

        // You can wrap everything inside an Optional
        // If number contains a value, optionalNumber will get the same value
        Optional<Integer> optionalNumber = Optional.ofNullable(number);  // optionalNumber = 5

        // otherwise, if number is null, optionalNumber will become empty (NOT null this time because ofNullable() method)
//        number = null;
        optionalNumber = Optional.ofNullable(number);

        System.out.println(optionalNumber);

        // We can check if optionalNumber contains a value ifPresent() method
        if (optionalNumber.isPresent()) {
            System.out.println(optionalNumber.get());
        } else {
            System.out.println("optionalNumber is empty");
        }

        // Why Optionals are good?
        User vipUser = new User();

        // Without Optionals, below code throws NPE (NullPointerException)
//        String isoCode = vipUser.getAddress().getCountry().getIsoCode();

        // To avoid, we should do a null check for every single object
        if (vipUser != null) {
            Address address = vipUser.getAddress();
            if (address != null) {
                Country country = address.getCountry();
                if (country != null) {
                    String isoCode = country.getIsoCode();
                }
            }
        }

        // How to create an empty Optional using empty() method?
        User user = new User();
        Optional<User> emptyOpt = Optional.empty();

//        emptyOpt.get();  // calling get() on an empty optional will throw NoSuchElementException

        //  What's the difference between Optional.of() and Optional.ofNullable()?
        User silverUser = new User();
        silverUser = null;
//        Optional<User> opt = Optional.of(silverUser);  // if silverUser is null, we get NPE
        Optional<User> op2 = Optional.ofNullable(silverUser); // if silverUser is null, we DO NOT get NPE

        // How to return default value using Optionals?
        User bronzeUser = null;
        Optional<User> optionalUser = Optional.ofNullable(bronzeUser);

        User user2 = optionalUser.orElse(new User()); // if optionalUser contains value, return it, otherwise return new User();
        System.out.println(user2);

    }
}
