# InvSync

This is a fabric mod for 1.16.x that Allows you to sync player inventories, health, food level, experience and score across multiple servers! This is acomplished using an sqlite database. Most mods should have no problem running along side, and modded items will also be sync'd.

## Getting Started

Setup is very simple. Drop the mod into your mods folder on all the servers you want to sync. Starting a server will generate a config with the following contents:

- SQLite Settings:
  - Database Name: The name of the sqlite database you want generated or your existing database  
  - Database Table Name: The name of the table that will store player data in your database
  - Database Directory: The Directory where you want the databse to be created or where your existing one already lives
  - Enable WAL Mode: This will increase read/write speed to the database and help with task concurrency, however has the potential to cause problems on very large databases. Most users will find it benifical to leave this on.

- Sync Settings: 
  - Sync Inv: Sync player inventory between servers 
  - Sync Armour: Sync player armour between servers
  - Sync eChest: Sync player ender chest between servers
  - Sync Xp: Sync player experience between servers
  - Sync Score: Sync player score between servers
  - Sync Health: Sync player health between servers
  - Sync Food Level: Sync player food level between servers

## IMPORTANT NOTES: 

- Configs MUST be identical between all participating servers in order for the mod to function correctly
- Due to the way the mod loads and saves player data, the mod will clear player inventories upon first join. This is not a problem when the mod is set up on a server from the get go, however will erase player inventories on servers with exisiting worlds and progress.
