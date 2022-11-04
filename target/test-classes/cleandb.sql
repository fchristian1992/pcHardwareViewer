delete from computer_builds;

delete from users;

insert into users (userId, username, password) VALUES (1, 'fchristian', 'student');

insert into users (userId, username, password) VALUES (2, 'achristian', 'lollipop');

insert into computer_builds (cpu_model, gpu_model, cpu_cooler_model, motherboard_model, psu_model, case_model,
                             data_storage_model, ram_model, userId)
values ('Ryzen 7 5800X3D', 'PowerColor Red Devil OC Radeon RX 6950 XT', 'Deepcool AK620', 'MSI MAG B550 Tomahawk',
        'Thermaltake Toughpower GF1 PE 850 W', 'Corsair 4000D Airflow ATX Mid Tower', 'Samsung 970 Evo Plus 2 TB NVMe SSD',
        'Corsair Vengeance LPX 16 GB (2 x 8 GB) DDR4-3600 CL18', 1);

insert into computer_builds (cpu_model, gpu_model, cpu_cooler_model, motherboard_model, psu_model, case_model,
                             data_storage_model, ram_model, userId)
values ('Ryzen 3 3200G', 'Gigabyte GAMING OC Radeon RX 5700 XT', 'Stock', 'Gigabyte B450M DS3H Wifi',
        'Fractal Design Ion SFX 650 W', 'Thermaltake Core G3 ATX Mid Tower', 'Teamgroup GX2 512 GB SSD',
        'Corsair Vengeance LPX 16 GB (2 x 8 GB) DDR4-3200 CL16', 2);