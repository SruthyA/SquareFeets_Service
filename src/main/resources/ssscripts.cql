CREATE TABLE user (
    id TEXT PRIMARY KEY,
    name TEXT,
    description TEXT,
    contact_info FROZEN<contactinfo>,
    is_verified BOOLEAN,
    created_at BIGINT,
    updated_at BIGINT,
    user_type TEXT
);

CREATE TYPE contactinfo (
    email TEXT,
    phone TEXT,
    alternate_phone TEXT,
    address FROZEN<address>
);

CREATE TYPE address (
    house_id TEXT,
    house_address TEXT,
    street TEXT,
    city TEXT,
    state TEXT,
    zip_code TEXT,
    country TEXT
);