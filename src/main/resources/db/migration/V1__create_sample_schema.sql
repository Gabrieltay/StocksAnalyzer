DROP TABLE IF EXISTS `User`;

CREATE TABLE IF NOT EXISTS `User` (
    `id` SERIAL PRIMARY KEY,
    `name` VARCHAR(20) NOT NULL,
    `email` VARCHAR(50) NOT NULL,
    `updated_dt` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `created_dt` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB;