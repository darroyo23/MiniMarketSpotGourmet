CREATE SEQUENCE minimarket.seq_users_id START 1 INCREMENT 1;
CREATE SEQUENCE minimarket.seq_roles_id START 1 INCREMENT 1;
CREATE SEQUENCE minimarket.seq_permission_groups_id START 1 INCREMENT 1;
CREATE SEQUENCE minimarket.seq_permissions_id START 1 INCREMENT 1;
CREATE SEQUENCE minimarket.seq_categories_id START 1 INCREMENT 1;
CREATE SEQUENCE minimarket.seq_products_id START 1 INCREMENT 1;
CREATE SEQUENCE minimarket.seq_combos_id START 1 INCREMENT 1;
CREATE SEQUENCE minimarket.seq_combo_availability_id START 1 INCREMENT 1;
CREATE SEQUENCE minimarket.seq_business_hours_id START 1 INCREMENT 1;
CREATE SEQUENCE minimarket.seq_orders_id START 1 INCREMENT 1;
CREATE SEQUENCE minimarket.seq_order_items_id START 1 INCREMENT 1;
CREATE SEQUENCE minimarket.seq_payments_id START 1 INCREMENT 1;
CREATE SEQUENCE minimarket.seq_limit_rules_id START 1 INCREMENT 1;
CREATE SEQUENCE minimarket.seq_external_users_id START 1 INCREMENT 1;
CREATE SEQUENCE minimarket.seq_id_economic_activity START 1 INCREMENT 1;
CREATE SEQUENCE minimarket.seq_invoice_id START 1 INCREMENT 1;
CREATE SEQUENCE minimarket.seq_ticket_id START 1 INCREMENT 1;

CREATE SEQUENCE minimarket.seq_checkout_counter_id START 1 INCREMENT 1;
CREATE SEQUENCE minimarket.seq_checkout_counter_desc_id START 1 INCREMENT 1;   


-- PROVINCIAS
CREATE TABLE minimarket.provincias (
    id BIGINT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL UNIQUE,
    is_active BOOLEAN NOT NULL DEFAULT TRUE
);



-- CANTONES
CREATE TABLE minimarket.cantones (
    id BIGINT PRIMARY KEY,
    provincia_id INT NOT NULL REFERENCES minimarket.provincias(id) ON DELETE CASCADE,
    nombre VARCHAR(100) NOT NULL,
    is_active BOOLEAN NOT NULL DEFAULT TRUE,
    UNIQUE (provincia_id, nombre)
);



-- DISTRITOS
CREATE TABLE minimarket.distritos (
    id BIGINT PRIMARY KEY,
    canton_id INT NOT NULL REFERENCES minimarket.cantones(id) ON DELETE CASCADE,
    nombre VARCHAR(100) NOT NULL,
    is_active BOOLEAN NOT NULL DEFAULT TRUE,
    UNIQUE (canton_id, nombre)
);



CREATE TABLE minimarket.economic_activity (
    id BIGINT PRIMARY KEY DEFAULT nextval('minimarket.seq_id_economic_activity'),
    activity_code VARCHAR(50) not null,
    description TEXT not null,        
    is_active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    created_by BIGINT,
    updated_at TIMESTAMP,
    updated_by BIGINT,
    UNIQUE (activity_code)
);




CREATE TABLE minimarket.external_users (
    id BIGINT DEFAULT nextval('minimarket.seq_external_users_id'),
    id_type INT NOT NULL,
    id_number INT NOT NULL,
    name VARCHAR(255) NOT NULL,
    middle_name VARCHAR(255),
    last_name VARCHAR(255) NOT NULL,
    second_last_name VARCHAR(255) NOT NULL,
    phone_number INT NOT NULL,
    email VARCHAR(255) NOT NULL,
    id_provincia BIGINT REFERENCES minimarket.provincias(id),
    id_canton BIGINT REFERENCES minimarket.cantones(id),
    id_distrito BIGINT REFERENCES minimarket.distritos(id),
    id_economic_activity BIGINT REFERENCES minimarket.economic_activity(id),
    is_active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    created_by BIGINT,
    updated_at TIMESTAMP,
    updated_by BIGINT,
    PRIMARY KEY (id_type, id_number)
);







CREATE TABLE minimarket.users (
    id BIGINT PRIMARY KEY DEFAULT nextval('minimarket.seq_users_id'),
    user_name VARCHAR(100) NOT NULL,
    name  VARCHAR(150) NOT NULL,
    last_name  VARCHAR(150) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,    
    is_active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    created_by BIGINT,
    updated_at TIMESTAMP,
    updated_by BIGINT
);



CREATE TABLE minimarket.roles (
    id BIGINT PRIMARY KEY DEFAULT nextval('minimarket.seq_roles_id'),
    name VARCHAR(100) UNIQUE NOT NULL,
    is_active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    created_by BIGINT REFERENCES minimarket.users(id),
    updated_at TIMESTAMP,
    updated_by BIGINT REFERENCES minimarket.users(id)
);



CREATE TABLE minimarket.permission_groups (
    id BIGINT PRIMARY KEY DEFAULT nextval('minimarket.seq_permission_groups_id'),
    code VARCHAR(100) UNIQUE NOT NULL, -- Ej: ORDERS, USERS, CATALOG
    name VARCHAR(150) NOT NULL,
    description TEXT,
    is_active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    created_by BIGINT REFERENCES minimarket.users(id),
    updated_at TIMESTAMP,
    updated_by BIGINT REFERENCES minimarket.users(id)
);


CREATE TABLE minimarket.permissions (
    id BIGINT PRIMARY KEY DEFAULT nextval('minimarket.seq_permissions_id'),
    group_id BIGINT NOT NULL REFERENCES minimarket.permission_groups(id) ON DELETE CASCADE,
    code VARCHAR(150) UNIQUE NOT NULL, -- Ej: ORDERS_CREATE
    name VARCHAR(150) NOT NULL,
    description TEXT,
    is_active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    created_by BIGINT REFERENCES minimarket.users(id),
    updated_at TIMESTAMP,
    updated_by BIGINT REFERENCES minimarket.users(id)
);


CREATE TABLE minimarket.role_permissions (
    role_id BIGINT NOT NULL REFERENCES minimarket.roles(id) ON DELETE CASCADE,
    permission_id BIGINT NOT NULL REFERENCES minimarket.permissions(id) ON DELETE CASCADE,
    is_active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    created_by BIGINT REFERENCES minimarket.users(id),
    updated_at TIMESTAMP,
    updated_by BIGINT REFERENCES minimarket.users(id),
    PRIMARY KEY (role_id, permission_id)
);


CREATE TABLE minimarket.user_roles (
    user_id BIGINT NOT NULL REFERENCES minimarket.users(id) ON DELETE CASCADE,
    role_id BIGINT NOT NULL REFERENCES minimarket.roles(id) ON DELETE CASCADE,
    is_primary BOOLEAN NOT NULL DEFAULT FALSE,
    is_active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    created_by BIGINT REFERENCES minimarket.users(id),
    updated_at TIMESTAMP,
    updated_by BIGINT REFERENCES minimarket.users(id),
    PRIMARY KEY (user_id, role_id)
);


CREATE TABLE minimarket.categories (
    id BIGINT PRIMARY KEY DEFAULT nextval('minimarket.seq_categories_id'),
    name VARCHAR(250) NOT NULL,
    is_active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    created_by BIGINT REFERENCES minimarket.users(id),
    updated_at TIMESTAMP,
    updated_by BIGINT REFERENCES minimarket.users(id)
);


CREATE TABLE minimarket.products (
    id BIGINT PRIMARY KEY DEFAULT nextval('minimarket.seq_products_id'),
    category_id BIGINT NOT NULL REFERENCES minimarket.categories(id),
    name VARCHAR(250) NOT NULL,
    cost_price NUMERIC(10,2) NOT NULL,
    sale_price NUMERIC(10,2) NOT NULL,
    revenew_percentaje NUMERIC(10) NOT NULL,
    is_active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    created_by BIGINT REFERENCES minimarket.users(id),
    updated_at TIMESTAMP,
    updated_by BIGINT REFERENCES minimarket.users(id)
);


CREATE TABLE minimarket.combos (
    id BIGINT PRIMARY KEY DEFAULT nextval('minimarket.seq_combos_id'),
    name VARCHAR(250) NOT NULL,
    price NUMERIC(10,2) NOT NULL,
    is_active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    created_by BIGINT REFERENCES minimarket.users(id),
    updated_at TIMESTAMP,
    updated_by BIGINT REFERENCES minimarket.users(id)
);


CREATE TABLE minimarket.combo_items (
    combo_id BIGINT REFERENCES minimarket.combos(id) ON DELETE CASCADE,
    product_id BIGINT REFERENCES minimarket.products(id),
    quantity INT NOT NULL,
	is_active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    created_by BIGINT REFERENCES minimarket.users(id),
    updated_at TIMESTAMP,
    updated_by BIGINT REFERENCES minimarket.users(id),
    PRIMARY KEY (combo_id, product_id)
);

CREATE TABLE minimarket.combo_availability (
    id BIGINT PRIMARY KEY DEFAULT nextval('minimarket.seq_combo_availability_id'),
    combo_id BIGINT REFERENCES minimarket.combos(id) ON DELETE CASCADE,
    day_of_week INT NOT NULL CHECK (day_of_week BETWEEN 0 AND 6),
    start_time TIME NOT NULL,
    end_time TIME NOT NULL,
	is_active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    created_by BIGINT REFERENCES minimarket.users(id),
    updated_at TIMESTAMP,
    updated_by BIGINT REFERENCES minimarket.users(id)
);

CREATE TABLE minimarket.business_hours (
    id BIGINT PRIMARY KEY DEFAULT nextval('minimarket.seq_business_hours_id'),
    fulfillment_type VARCHAR(20) NOT NULL, -- pickup | delivery
    day_of_week INT NOT NULL CHECK (day_of_week BETWEEN 0 AND 6),
    start_time TIME NOT NULL,
    end_time TIME NOT NULL,
    is_active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    created_by BIGINT REFERENCES minimarket.users(id),
    updated_at TIMESTAMP,
    updated_by BIGINT REFERENCES minimarket.users(id)
);

CREATE TABLE minimarket.closed_days (
    date DATE PRIMARY KEY,
    reason VARCHAR(255),
	is_active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    created_by BIGINT REFERENCES minimarket.users(id),
    updated_at TIMESTAMP,
    updated_by BIGINT REFERENCES minimarket.users(id)
);

CREATE TABLE minimarket.orders (
    id BIGINT PRIMARY KEY DEFAULT nextval('minimarket.seq_orders_id'),
    user_id BIGINT REFERENCES minimarket.users(id),
    fulfillment_type VARCHAR(20) NOT NULL, -- pickup | delivery
    status VARCHAR(20) NOT NULL,
    payment_confirmed BOOLEAN NOT NULL DEFAULT FALSE,
    is_active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    created_by BIGINT REFERENCES minimarket.users(id),
    updated_at TIMESTAMP,
    updated_by BIGINT REFERENCES minimarket.users(id)
);

CREATE TABLE minimarket.order_items (
    id BIGINT PRIMARY KEY DEFAULT nextval('minimarket.seq_order_items_id'),
    order_id BIGINT REFERENCES minimarket.orders(id) ON DELETE CASCADE,
    product_id BIGINT REFERENCES minimarket.products(id),
    quantity INT NOT NULL,
    unit_price NUMERIC(10,2) NOT NULL,
	is_active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    created_by BIGINT REFERENCES minimarket.users(id),
    updated_at TIMESTAMP,
    updated_by BIGINT REFERENCES minimarket.users(id)
);

CREATE TABLE minimarket.payments (
    id BIGINT PRIMARY KEY DEFAULT nextval('minimarket.seq_payments_id'),
    order_id BIGINT REFERENCES minimarket.orders(id),
    method VARCHAR(50),
    status VARCHAR(50),
    paid_at TIMESTAMP,
	is_active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    created_by BIGINT REFERENCES minimarket.users(id),
    updated_at TIMESTAMP,
    updated_by BIGINT REFERENCES minimarket.users(id)
);

CREATE TABLE minimarket.limit_rules (
    id BIGINT PRIMARY KEY DEFAULT nextval('minimarket.seq_permission_groups_id'),
    rule_type VARCHAR(50),
    value INT,
    scope VARCHAR(50),
    is_active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    created_by BIGINT REFERENCES minimarket.users(id),
    updated_at TIMESTAMP,
    updated_by BIGINT REFERENCES minimarket.users(id)
);



CREATE TABLE minimarket.invoice (
    id BIGINT PRIMARY KEY DEFAULT nextval('minimarket.seq_invoice_id'),
    order_id BIGINT REFERENCES minimarket.orders(id) ON DELETE CASCADE,
    -- valiar que mas campos son requeridos para la factura electronica para hacer un reenvio en caso de ser necesario
    is_sent BOOLEAN NOT NULL DEFAULT FALSE,
    is_active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    created_by BIGINT REFERENCES minimarket.users(id),
    updated_at TIMESTAMP,
    updated_by BIGINT REFERENCES minimarket.users(id)
);


CREATE TABLE minimarket.ticket (
    id BIGINT PRIMARY KEY DEFAULT nextval('minimarket.seq_ticket_id'),
    order_id BIGINT REFERENCES minimarket.orders(id) ON DELETE CASCADE,
    -- valiar que mas campos son requeridos para el ticket de caja
    is_active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    created_by BIGINT REFERENCES minimarket.users(id),
    updated_at TIMESTAMP,
    updated_by BIGINT REFERENCES minimarket.users(id)
);



/*
Drops

DO $$ DECLARE
    r record;
BEGIN
    FOR r IN (SELECT schemaname, tablename FROM pg_tables WHERE schemaname = 'minimarket') LOOP
        EXECUTE 'DROP TABLE IF EXISTS ' || r.schemaname||'.'||r.tablename || ' CASCADE';
		commit;
    END LOOP;
END $$;

*/

--SELECT tablename FROM pg_tables WHERE schemaname = 'minimarket';

select * from minimarket.business_hours;






