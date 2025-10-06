CREATE KEYSPACE pagibig WITH replication = {
    'class': 'NetworkTopologyStrategy',
    'southeast-1': 2
};

USE pagibig;

CREATE TABLE properties (
    id UUID,
    type TEXT,
    name TEXT,
    description TEXT,
    address TEXT,
    price DECIMAL,
    PRIMARY KEY ((type), id)
);

INSERT INTO properties (id, type, name, description, address, price) VALUES (uuid(), 'Lot', 'A lot in Ozamiz', 'Some lot in Ozamiz', 'Ozamiz City', 250000.00);
INSERT INTO properties (id, type, name, description, address, price) VALUES (uuid(), 'House', 'A house and lot in Ozamiz', 'Some lot in Ozamiz', 'Ozamiz City', 250000.00);