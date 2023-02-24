# Sakila database description

## Tables

- `country` - table that contains a list of countries;
- `city` - table that contains a list of **cities** (in country with FK: `country_id`);
- `address` - table that contains a list of address information by **cities** (`city_id`) for entities:
  - customers;
  - staff;
  - stores.
- `store` - table that contains a list of stores ("Home stores" for customer and staff) with specific **address** (`address_id`) and manager head (`manager_staff_id`);
- `staff` - table that contains a list of staff, each staff member has "Home store" (`store_id`) and own living address (`address_id`);
- `inventory` - table that contains information about each **film** (`film_id`) in each store (`store_id`);
- `film` - table that contains information about films in stock in the **store** (`store_id` in related with this film **inventory** table row), each film have relation with **language** table from `language_id` (dubbed language) and `original_language_id`;
- `language` - simple table that contains a list of languages for films;
- `film_actor` - table for many-to-many relation between a list of films (**film** table) and list of actors (**actor** table);
- `actor` - table that contains information about film actors (last and first names);
- `film_category` - table for many-to-many relation between a list of films (**film** table) and list of film categories (**category** table);
- `category` - table that contains information about **film** categories;
- `rental` - table that contains information about each rent, like staff who processed rental (`staff_id`), customer (`customer_id`), rental inventory item id (`inventory_id`) and dates of rental and return (`rental_date` and `return_date`);
- `customer` - table that contains information about customers, each customer have "Home store" (`store_id`), address (`address_id`) and `active` field - that use like "soft delete" flag and show that current customer not active anymore;
- `payment` - table that contains information about **customer** (`customer_id`) payments, with data about **staff** member (`staff_id`) who processed payment and optional `rental_id` field, that show that payment connect with some rental, or maybe, if this field is NULL, with other types of payment.

## Additional tables

- `film_text` - special table that modified by triggers from **film** table and contains `title` and `description` fields from **film** for full-text search support.
