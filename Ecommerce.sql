IF EXISTS (SELECT name FROM sys.databases WHERE name = N'Ecommerce')
    DROP DATABASE [EcommerceData]
GO

CREATE DATABASE EcommerceData
GO

USE [EcommerceData]
GO

CREATE TABLE [dbo].[Admin]
(
    NOT NULL PRIMARY KEY,
    NOT NULL,
    NOT NULL,
    NOT NULL -- Assuming Passwords are hashed and stored securely
);

CREATE TABLE [dbo].[Customer]
(
    NOT NULL PRIMARY KEY,
    NOT NULL UNIQUE,
    NOT NULL,
    NOT NULL,
    NOT NULL,
    NOT NULL,
    NOT NULL, -- Assuming Passwords are hashed and stored securely
    NOT NULL,
    NOT NULL,
  FOREIGN KEY ([AID]) REFERENCES [Admin]([AID])
);

CREATE TABLE [dbo].[Seller]
(
    NOT NULL PRIMARY KEY,
    NOT NULL,
    NOT NULL -- Assuming Passwords are hashed and stored securely
);

CREATE TABLE [dbo].[Product]
(
    NOT NULL PRIMARY KEY,
    NOT NULL,
  [Quantity] [int] NOT NULL,
  [Price] [int] NOT NULL
);

CREATE TABLE [dbo].[Sells]
(
    NOT NULL,
    NOT NULL,
  PRIMARY KEY ([PID], [SID]),
  FOREIGN KEY ([PID]) REFERENCES [Product]([PID]),
  FOREIGN KEY ([SID]) REFERENCES [Seller]([SID])
);

CREATE TABLE [dbo].[Order]
(
    NOT NULL PRIMARY KEY,
  [DeliveryFee] [int] NOT NULL,
  [TransactionDate] [date] NOT NULL, -- Changed data type to date
    NOT NULL,
    NOT NULL,
    NOT NULL,
  FOREIGN KEY ([AID]) REFERENCES [Admin]([AID]),
  FOREIGN KEY ([CID]) REFERENCES [Customer]([CID]),
  FOREIGN KEY ([SID]) REFERENCES [Seller]([SID])
);

CREATE TABLE [dbo].[OrderItems]
(
  [ItemNo] [int] NOT NULL PRIMARY KEY,
  [Quantity] [int] NOT NULL,
    NOT NULL,
    NOT NULL,
  FOREIGN KEY ([PID]) REFERENCES [Product]([PID]),
  FOREIGN KEY ([OID]) REFERENCES [Order]([OID])
);

CREATE TABLE [dbo].[Searchs]
(
    NOT NULL,
    NOT NULL,
  PRIMARY KEY ([CID], [PID]),
  FOREIGN KEY ([CID]) REFERENCES [Customer]([CID]),
  FOREIGN KEY ([PID]) REFERENCES [Product]([PID])
);

-- Data Insertion
-- Admin
INSERT INTO [dbo].[Admin] ([AID], [AName], [Email], [Password]) VALUES 
('A01', 'PDM Project', 'PDMProject@email.com','hashed_password');

-- Customer
INSERT INTO [dbo].[Customer] ([CName], [CID], [UID], [Address], [Phone], [BAccount], [BName], [CPassword], [AID]) VALUES
('John Doe', 'C01', 'U01', '123 Main St, Anytown, USA', '1234567890', '11110000', 'Bank A', 'hashed_password', 'A01'),
-- More customer insertions here...

-- Seller
INSERT INTO [dbo].[Seller] ([SID], [SName], [SPassword]) VALUES
('S01', 'Oliver Wilson', 'hashed_password'),
-- More seller insertions here...

-- Product
INSERT INTO [dbo].[Product] ([PID], [PName], [Quantity], [Price]) VALUES
('P100001', 'Apple', 50, 15),
-- More product insertions here...

-- Order
INSERT INTO [dbo].[Order] ([OID], [DeliveryFee], [TransactionDate], [AID], [CID], [SID]) VALUES
('O10001', 10, '2023-11-30', 'A01', 'C02', 'S07'),
-- More order insertions here...

-- OrderItems
INSERT INTO [dbo].[OrderItems] ([ItemNo], [Quantity], [PID], [OID]) VALUES
(1001, 150, 'P100001', 'O10001'),
-- More order item insertions here...

-- Searchs
INSERT INTO [dbo].[Searchs] ([CID], [PID]) VALUES
('C01', 'P100001'),
-- More search insertions here...

-- Sells
INSERT INTO [dbo].[Sells] ([SID], [PID]) VALUES
('S01', 'P100001'),
-- More sells insertions here...