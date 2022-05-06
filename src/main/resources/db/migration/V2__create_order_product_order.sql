create table if not exists `order_product`
(
    `id`            bigint         not null auto_increment,
    `order_no`      varchar(255)   not null,
    `product_id`    bigint         not null,
    `product_price` decimal(10, 2) not null,
    primary key (`id`),
    key `idx_order_no` (order_no) USING BTREE
);

create table if not exists `order_customer`
(
    `id`            bigint       not null auto_increment,
    `order_no`      varchar(255) not null,
    `customer_name` varchar(255) not null,
    `customer_age`  varchar(255) not null,
    primary key (`id`),
    key `idx_order_no` (order_no) USING BTREE
)