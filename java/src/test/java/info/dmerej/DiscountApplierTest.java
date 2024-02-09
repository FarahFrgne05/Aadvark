package info.dmerej;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountApplierTest {

  User user1 = new User("Laurie", "laurie@efrei.net");
  User user2 = new User("Farah", "farah@efrei.net");
  List<User> listUsers = new ArrayList<>(List.of(user1, user2));
  int discount = 10;

  int count = 0;

  @Test
  void should_notify_twice_when_applying_discount_for_two_users_v1() {
    // TODO: write a test to demonstrate the bug in DiscountApplier.applyV1()

    Notifier notifier = new Notifier() {
      @Override
      public void notify(User user, String message) {
        count++;
      }
    };

    DiscountApplier discountApplier = new DiscountApplier(notifier);

    discountApplier.applyV1(discount, listUsers);

    assertEquals(2, count);

  }

  @Test
  void should_notify_twice_when_applying_discount_for_two_users_v2() {
    // TODO: write a test to demonstrate the bug in DiscountApplier.applyV2()
  }

}
