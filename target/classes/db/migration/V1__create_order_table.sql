create table if not exists `order`
(
    `id`          bigint         not null auto_increment,
    `order_no`    varchar(255)   not null,
    `customer_id` bigint         not null,
    `price`       decimal(10, 2) not null,
    primary key (`id`),
    key `idx_order_no` (order_no) USING BTREE
)