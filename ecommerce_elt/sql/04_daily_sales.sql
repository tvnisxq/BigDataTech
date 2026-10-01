USE ecommerce_dw;

DROP TABLE IF EXISTS daily_sales_summary;

CREATE TABLE daily_sales_summary (
    order_date DATE,
    total_sales DOUBLE,
    total_orders INT
)
STORED AS PARQUET;

INSERT OVERWRITE TABLE daily_sales_summary
SELECT
    order_date,
    SUM(amount),
    COUNT(order_id)
FROM orders_transformed
GROUP BY order_date;
