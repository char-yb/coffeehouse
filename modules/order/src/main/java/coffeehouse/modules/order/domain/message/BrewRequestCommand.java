package coffeehouse.modules.order.domain.message;

import coffeehouse.modules.order.domain.OrderId;

// 메세지를 보내기 위한 객체
public record BrewRequestCommand (OrderId orderId) {
}
