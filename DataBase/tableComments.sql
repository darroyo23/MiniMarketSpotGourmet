-- tableComments.sql


-- EXTERNAL provincias
COMMENT ON TABLE minimarket.provincias IS 'Stores provinces of Costa Rica';
COMMENT ON COLUMN minimarket.provincias.id IS 'Unique identifier for each province';
COMMENT ON COLUMN minimarket.provincias.nombre IS 'Name of the province';
COMMENT ON COLUMN minimarket.provincias.is_active IS 'Indicates if the province record is active';


-- EXTERNAL cantones
COMMENT ON TABLE minimarket.cantones IS 'Stores cantons belonging to provinces';
COMMENT ON COLUMN minimarket.cantones.id IS 'Unique identifier for each canton';
COMMENT ON COLUMN minimarket.cantones.provincia_id IS 'Province identifier (FK to provincias)';
COMMENT ON COLUMN minimarket.cantones.nombre IS 'Name of the canton';
COMMENT ON COLUMN minimarket.cantones.is_active IS 'Indicates if the canton record is active';


-- EXTERNAL distritos
COMMENT ON TABLE minimarket.distritos IS 'Stores districts belonging to cantons';
COMMENT ON COLUMN minimarket.distritos.id IS 'Unique identifier for each district';
COMMENT ON COLUMN minimarket.distritos.canton_id IS 'Canton identifier (FK to cantones)';
COMMENT ON COLUMN minimarket.distritos.nombre IS 'Name of the district';
COMMENT ON COLUMN minimarket.distritos.is_active IS 'Indicates if the district record is active';


-- Comentarios para la tabla economic_activity
COMMENT ON TABLE minimarket.economic_activity IS 'Stores catalog of economic activities for external users and businesses';

COMMENT ON COLUMN minimarket.economic_activity.id IS 'Unique identifier for each economic activity';
COMMENT ON COLUMN minimarket.economic_activity.activity_code IS 'Code assigned to the economic activity (string format, up to 50 characters)';
COMMENT ON COLUMN minimarket.economic_activity.description IS 'Detailed description of the economic activity';
COMMENT ON COLUMN minimarket.economic_activity.is_active IS 'Indicates if the economic activity record is active';
COMMENT ON COLUMN minimarket.economic_activity.created_at IS 'Timestamp when the record was created';
COMMENT ON COLUMN minimarket.economic_activity.created_by IS 'User who created the record';
COMMENT ON COLUMN minimarket.economic_activity.updated_at IS 'Timestamp when the record was last updated';
COMMENT ON COLUMN minimarket.economic_activity.updated_by IS 'User who last updated the record';



-- EXTERNAL USERS
COMMENT ON TABLE minimarket.external_users IS 'Stores external users information (customers, suppliers, etc.)';
COMMENT ON COLUMN minimarket.external_users.id IS 'Unique identifier for each external user';
COMMENT ON COLUMN minimarket.external_users.id_type IS 'Type of identification (e.g., national ID, passport)';
COMMENT ON COLUMN minimarket.external_users.id_number IS 'Identification number of the external user';
COMMENT ON COLUMN minimarket.external_users.name IS 'First name of the external user';
COMMENT ON COLUMN minimarket.external_users.middle_name IS 'Middle name of the external user';
COMMENT ON COLUMN minimarket.external_users.last_name IS 'Last name of the external user';
COMMENT ON COLUMN minimarket.external_users.second_last_name IS 'Second last name of the external user';
COMMENT ON COLUMN minimarket.external_users.phone_number IS 'Phone number of the external user';
COMMENT ON COLUMN minimarket.external_users.email IS 'Email address of the external user';
COMMENT ON COLUMN minimarket.external_users.id_provincia IS 'Province identifier (FK to provincias)';
COMMENT ON COLUMN minimarket.external_users.id_canton IS 'Canton identifier (FK to cantones)';
COMMENT ON COLUMN minimarket.external_users.id_distrito IS 'District identifier (FK to distritos)';
COMMENT ON COLUMN minimarket.external_users.id_economic_activity IS 'Economic activity identifier  (FK to economic_activity)';
COMMENT ON COLUMN minimarket.external_users.is_active IS 'Indicates if the external user record is active';
COMMENT ON COLUMN minimarket.external_users.created_at IS 'Timestamp when the record was created';
COMMENT ON COLUMN minimarket.external_users.created_by IS 'User who created the record';
COMMENT ON COLUMN minimarket.external_users.updated_at IS 'Timestamp when the record was last updated';
COMMENT ON COLUMN minimarket.external_users.updated_by IS 'User who last updated the record';


-- USERS
COMMENT ON TABLE minimarket.users IS 'Stores internal system users';
COMMENT ON COLUMN minimarket.users.id IS 'Unique identifier for each user';
COMMENT ON COLUMN minimarket.users.user_name IS 'System username';
COMMENT ON COLUMN minimarket.users.name IS 'First name of the user';
COMMENT ON COLUMN minimarket.users.last_name IS 'Last name of the user';
COMMENT ON COLUMN minimarket.users.email IS 'Unique email address of the user';
COMMENT ON COLUMN minimarket.users.is_active IS 'Indicates if the user account is active';
COMMENT ON COLUMN minimarket.users.created_at IS 'Timestamp when the record was created';
COMMENT ON COLUMN minimarket.users.created_by IS 'User who created the record';
COMMENT ON COLUMN minimarket.users.updated_at IS 'Timestamp when the record was last updated';
COMMENT ON COLUMN minimarket.users.updated_by IS 'User who last updated the record';

-- ROLES
COMMENT ON TABLE minimarket.roles IS 'Stores roles for access control';
COMMENT ON COLUMN minimarket.roles.id IS 'Unique identifier for each role';
COMMENT ON COLUMN minimarket.roles.name IS 'Role name (e.g., admin, cashier)';
COMMENT ON COLUMN minimarket.roles.is_active IS 'Indicates if the role is active';
COMMENT ON COLUMN minimarket.roles.created_at IS 'Timestamp when the record was created';
COMMENT ON COLUMN minimarket.roles.created_by IS 'User who created the record (FK to users)';
COMMENT ON COLUMN minimarket.roles.updated_at IS 'Timestamp when the record was last updated';
COMMENT ON COLUMN minimarket.roles.updated_by IS 'User who last updated the record (FK to users)';

-- PERMISSION GROUPS
COMMENT ON TABLE minimarket.permission_groups IS 'Stores groups of permissions (modules)';
COMMENT ON COLUMN minimarket.permission_groups.id IS 'Unique identifier for each permission group';
COMMENT ON COLUMN minimarket.permission_groups.code IS 'Unique code for the group (e.g., ORDERS, USERS)';
COMMENT ON COLUMN minimarket.permission_groups.name IS 'Name of the permission group';
COMMENT ON COLUMN minimarket.permission_groups.description IS 'Description of the permission group';
COMMENT ON COLUMN minimarket.permission_groups.is_active IS 'Indicates if the permission group is active';
COMMENT ON COLUMN minimarket.permission_groups.created_at IS 'Timestamp when the record was created';
COMMENT ON COLUMN minimarket.permission_groups.created_by IS 'User who created the record (FK to users)';
COMMENT ON COLUMN minimarket.permission_groups.updated_at IS 'Timestamp when the record was last updated';
COMMENT ON COLUMN minimarket.permission_groups.updated_by IS 'User who last updated the record (FK to users)';

-- PERMISSIONS
COMMENT ON TABLE minimarket.permissions IS 'Stores individual permissions for access control';
COMMENT ON COLUMN minimarket.permissions.id IS 'Unique identifier for each permission';
COMMENT ON COLUMN minimarket.permissions.group_id IS 'Permission group identifier (FK to permission_groups)';
COMMENT ON COLUMN minimarket.permissions.code IS 'Unique code for the permission (e.g., ORDERS_CREATE)';
COMMENT ON COLUMN minimarket.permissions.name IS 'Name of the permission';
COMMENT ON COLUMN minimarket.permissions.description IS 'Description of the permission';
COMMENT ON COLUMN minimarket.permissions.is_active IS 'Indicates if the permission is active';
COMMENT ON COLUMN minimarket.permissions.created_at IS 'Timestamp when the record was created';
COMMENT ON COLUMN minimarket.permissions.created_by IS 'User who created the record (FK to users)';
COMMENT ON COLUMN minimarket.permissions.updated_at IS 'Timestamp when the record was last updated';
COMMENT ON COLUMN minimarket.permissions.updated_by IS 'User who last updated the record (FK to users)';

-- ROLE PERMISSIONS
COMMENT ON TABLE minimarket.role_permissions IS 'Stores permissions assigned to roles';
COMMENT ON COLUMN minimarket.role_permissions.role_id IS 'Role identifier (FK to roles)';
COMMENT ON COLUMN minimarket.role_permissions.permission_id IS 'Permission identifier (FK to permissions)';
COMMENT ON COLUMN minimarket.role_permissions.is_active IS 'Indicates if the role-permission assignment is active';
COMMENT ON COLUMN minimarket.role_permissions.created_at IS 'Timestamp when the record was created';
COMMENT ON COLUMN minimarket.role_permissions.created_by IS 'User who created the record (FK to users)';
COMMENT ON COLUMN minimarket.role_permissions.updated_at IS 'Timestamp when the record was last updated';
COMMENT ON COLUMN minimarket.role_permissions.updated_by IS 'User who last updated the record (FK to users)';

-- USER ROLES
COMMENT ON TABLE minimarket.user_roles IS 'Stores roles assigned to users';
COMMENT ON COLUMN minimarket.user_roles.user_id IS 'User identifier (FK to users)';
COMMENT ON COLUMN minimarket.user_roles.role_id IS 'Role identifier (FK to roles)';
COMMENT ON COLUMN minimarket.user_roles.is_primary IS 'Indicates if this is the primary role for the user';
COMMENT ON COLUMN minimarket.user_roles.is_active IS 'Indicates if the user-role assignment is active';
COMMENT ON COLUMN minimarket.user_roles.created_at IS 'Timestamp when the record was created';
COMMENT ON COLUMN minimarket.user_roles.created_by IS 'User who created the record (FK to users)';
COMMENT ON COLUMN minimarket.user_roles.updated_at IS 'Timestamp when the record was last updated';
COMMENT ON COLUMN minimarket.user_roles.updated_by IS 'User who last updated the record (FK to users)';

-- categories
COMMENT ON TABLE minimarket.categories IS 'Stores product categories for the minimarket';
COMMENT ON COLUMN minimarket.categories.id IS 'Unique identifier for each category';
COMMENT ON COLUMN minimarket.categories.name IS 'Category name (e.g., beverages, snacks)';
COMMENT ON COLUMN minimarket.categories.is_active IS 'Indicates if the category is active';
COMMENT ON COLUMN minimarket.categories.created_at IS 'Timestamp when the record was created';
COMMENT ON COLUMN minimarket.categories.created_by IS 'User who created the record (FK to users)';
COMMENT ON COLUMN minimarket.categories.updated_at IS 'Timestamp when the record was last updated';
COMMENT ON COLUMN minimarket.categories.updated_by IS 'User who last updated the record (FK to users)';

-- PRODUCTS
COMMENT ON TABLE minimarket.products IS 'Stores products available in the minimarket';
COMMENT ON COLUMN minimarket.products.id IS 'Unique identifier for each product';
COMMENT ON COLUMN minimarket.products.category_id IS 'Category to which the product belongs (FK to categories)';
COMMENT ON COLUMN minimarket.products.name IS 'Product name';
COMMENT ON COLUMN minimarket.products.cost_price IS 'Cost price of the product';
COMMENT ON COLUMN minimarket.products.sale_price IS 'Sale price of the product';
COMMENT ON COLUMN minimarket.products.revenew_percentaje IS 'Revenue percentage margin for the product';
COMMENT ON COLUMN minimarket.products.is_active IS 'Indicates if the product is active';
COMMENT ON COLUMN minimarket.products.created_at IS 'Timestamp when the record was created';
COMMENT ON COLUMN minimarket.products.created_by IS 'User who created the record (FK to users)';
COMMENT ON COLUMN minimarket.products.updated_at IS 'Timestamp when the record was last updated';
COMMENT ON COLUMN minimarket.products.updated_by IS 'User who last updated the record (FK to users)';

-- COMBOS
COMMENT ON TABLE minimarket.combos IS 'Stores product combos offered by the minimarket';
COMMENT ON COLUMN minimarket.combos.id IS 'Unique identifier for each combo';
COMMENT ON COLUMN minimarket.combos.name IS 'Combo name';
COMMENT ON COLUMN minimarket.combos.price IS 'Sale price of the combo';
COMMENT ON COLUMN minimarket.combos.is_active IS 'Indicates if the combo is active';
COMMENT ON COLUMN minimarket.combos.created_at IS 'Timestamp when the record was created';
COMMENT ON COLUMN minimarket.combos.created_by IS 'User who created the record (FK to users)';
COMMENT ON COLUMN minimarket.combos.updated_at IS 'Timestamp when the record was last updated';
COMMENT ON COLUMN minimarket.combos.updated_by IS 'User who last updated the record (FK to users)';

-- COMBO ITEMS
COMMENT ON TABLE minimarket.combo_items IS 'Stores items that belong to a combo';
COMMENT ON COLUMN minimarket.combo_items.combo_id IS 'Combo identifier (FK to combos)';
COMMENT ON COLUMN minimarket.combo_items.product_id IS 'Product identifier (FK to products)';
COMMENT ON COLUMN minimarket.combo_items.quantity IS 'Quantity of the product in the combo';
COMMENT ON COLUMN minimarket.combo_items.is_active IS 'Indicates if the combo item is active';
COMMENT ON COLUMN minimarket.combo_items.created_at IS 'Timestamp when the record was created';
COMMENT ON COLUMN minimarket.combo_items.created_by IS 'User who created the record (FK to users)';
COMMENT ON COLUMN minimarket.combo_items.updated_at IS 'Timestamp when the record was last updated';
COMMENT ON COLUMN minimarket.combo_items.updated_by IS 'User who last updated the record (FK to users)';

-- COMBO AVAILABILITY
COMMENT ON TABLE minimarket.combo_availability IS 'Defines availability of combos by day and time';
COMMENT ON COLUMN minimarket.combo_availability.id IS 'Unique identifier for each availability record';
COMMENT ON COLUMN minimarket.combo_availability.combo_id IS 'Combo identifier (FK to combos)';
COMMENT ON COLUMN minimarket.combo_availability.day_of_week IS 'Day of the week (0=Sunday, 6=Saturday)';
COMMENT ON COLUMN minimarket.combo_availability.start_time IS 'Start time of availability';
COMMENT ON COLUMN minimarket.combo_availability.end_time IS 'End time of availability';
COMMENT ON COLUMN minimarket.combo_availability.is_active IS 'Indicates if the availability record is active';
COMMENT ON COLUMN minimarket.combo_availability.created_at IS 'Timestamp when the record was created';
COMMENT ON COLUMN minimarket.combo_availability.created_by IS 'User who created the record (FK to users)';
COMMENT ON COLUMN minimarket.combo_availability.updated_at IS 'Timestamp when the record was last updated';
COMMENT ON COLUMN minimarket.combo_availability.updated_by IS 'User who last updated the record (FK to users)';

-- BUSINESS HOURS
COMMENT ON TABLE minimarket.business_hours IS 'Defines business operating hours for pickup and delivery';
COMMENT ON COLUMN minimarket.business_hours.id IS 'Unique identifier for each business hour record';
COMMENT ON COLUMN minimarket.business_hours.fulfillment_type IS 'Type of fulfillment (pickup or delivery)';
COMMENT ON COLUMN minimarket.business_hours.day_of_week IS 'Day of the week (0=Sunday, 6=Saturday)';
COMMENT ON COLUMN minimarket.business_hours.start_time IS 'Start time of business hours';
COMMENT ON COLUMN minimarket.business_hours.end_time IS 'End time of business hours';
COMMENT ON COLUMN minimarket.business_hours.is_active IS 'Indicates if the business hour record is active';
COMMENT ON COLUMN minimarket.business_hours.created_at IS 'Timestamp when the record was created';
COMMENT ON COLUMN minimarket.business_hours.created_by IS 'User who created the record (FK to users)';
COMMENT ON COLUMN minimarket.business_hours.updated_at IS 'Timestamp when the record was last updated';
COMMENT ON COLUMN minimarket.business_hours.updated_by IS 'User who last updated the record (FK to users)';

-- CLOSED DAYS
COMMENT ON TABLE minimarket.closed_days IS 'Stores days when the business is closed';
COMMENT ON COLUMN minimarket.closed_days.date IS 'Date of closure (primary key)';
COMMENT ON COLUMN minimarket.closed_days.reason IS 'Reason for closure';
COMMENT ON COLUMN minimarket.closed_days.is_active IS 'Indicates if the closure record is active';
COMMENT ON COLUMN minimarket.closed_days.created_at IS 'Timestamp when the record was created';
COMMENT ON COLUMN minimarket.closed_days.created_by IS 'User who created the record (FK to users)';
COMMENT ON COLUMN minimarket.closed_days.updated_at IS 'Timestamp when the record was last updated';
COMMENT ON COLUMN minimarket.closed_days.updated_by IS 'User who last updated the record (FK to users)';

-- ORDERS
COMMENT ON TABLE minimarket.orders IS 'Stores customer orders';
COMMENT ON COLUMN minimarket.orders.id IS 'Unique identifier for each order';
COMMENT ON COLUMN minimarket.orders.user_id IS 'User who placed the order (FK to users)';
COMMENT ON COLUMN minimarket.orders.fulfillment_type IS 'Type of fulfillment (pickup or delivery)';
COMMENT ON COLUMN minimarket.orders.status IS 'Current status of the order';
COMMENT ON COLUMN minimarket.orders.payment_confirmed IS 'Indicates if payment has been confirmed';
COMMENT ON COLUMN minimarket.orders.is_active IS 'Indicates if the order record is active';
COMMENT ON COLUMN minimarket.orders.created_at IS 'Timestamp when the record was created';
COMMENT ON COLUMN minimarket.orders.created_by IS 'User who created the record (FK to users)';
COMMENT ON COLUMN minimarket.orders.updated_at IS 'Timestamp when the record was last updated';
COMMENT ON COLUMN minimarket.orders.updated_by IS 'User who last updated the record (FK to users)';

-- ORDER ITEMS
COMMENT ON TABLE minimarket.order_items IS 'Stores items included in an order';
COMMENT ON COLUMN minimarket.order_items.id IS 'Unique identifier for each order item';
COMMENT ON COLUMN minimarket.order_items.order_id IS 'Order identifier (FK to orders)';
COMMENT ON COLUMN minimarket.order_items.product_id IS 'Product identifier (FK to products)';
COMMENT ON COLUMN minimarket.order_items.quantity IS 'Quantity of the product in the order';
COMMENT ON COLUMN minimarket.order_items.unit_price IS 'Unit price of the product at the time of order';
COMMENT ON COLUMN minimarket.order_items.is_active IS 'Indicates if the order item record is active';
COMMENT ON COLUMN minimarket.order_items.created_at IS 'Timestamp when the record was created';
COMMENT ON COLUMN minimarket.order_items.created_by IS 'User who created the record (FK to users)';
COMMENT ON COLUMN minimarket.order_items.updated_at IS 'Timestamp when the record was last updated';
COMMENT ON COLUMN minimarket.order_items.updated_by IS 'User who last updated the record (FK to users)';

-- PAYMENTS
COMMENT ON TABLE minimarket.payments IS 'Stores payment records for orders';
COMMENT ON COLUMN minimarket.payments.id IS 'Unique identifier for each payment';
COMMENT ON COLUMN minimarket.payments.order_id IS 'Order identifier (FK to orders)';
COMMENT ON COLUMN minimarket.payments.method IS 'Payment method used (e.g., cash, card)';
COMMENT ON COLUMN minimarket.payments.status IS 'Current status of the payment';
COMMENT ON COLUMN minimarket.payments.paid_at IS 'Timestamp when the payment was made';
COMMENT ON COLUMN minimarket.payments.is_active IS 'Indicates if the payment record is active';
COMMENT ON COLUMN minimarket.payments.created_at IS 'Timestamp when the record was created';
COMMENT ON COLUMN minimarket.payments.created_by IS 'User who created the record (FK to users)';
COMMENT ON COLUMN minimarket.payments.updated_at IS 'Timestamp when the record was last updated';
COMMENT ON COLUMN minimarket.payments.updated_by IS 'User who last updated the record (FK to users)';

-- LIMIT RULES
COMMENT ON TABLE minimarket.limit_rules IS 'Stores business rules and limits';
COMMENT ON COLUMN minimarket.limit_rules.id IS 'Unique identifier for each rule';
COMMENT ON COLUMN minimarket.limit_rules.rule_type IS 'Type of rule (e.g., max orders, max items)';
COMMENT ON COLUMN minimarket.limit_rules.value IS 'Value associated with the rule';
COMMENT ON COLUMN minimarket.limit_rules.scope IS 'Scope of the rule (e.g., per user, per day)';
COMMENT ON COLUMN minimarket.limit_rules.is_active IS 'Indicates if the rule is active';
COMMENT ON COLUMN minimarket.limit_rules.created_at IS 'Timestamp when the record was created';
COMMENT ON COLUMN minimarket.limit_rules.created_by IS 'User who created the record (FK to users)';
COMMENT ON COLUMN minimarket.limit_rules.updated_at IS 'Timestamp when the record was last updated';
COMMENT ON COLUMN minimarket.limit_rules.updated_by IS 'User who last updated the record (FK to users)';