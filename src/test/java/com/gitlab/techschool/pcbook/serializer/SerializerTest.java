package com.gitlab.techschool.pcbook.serializer;

import com.gitlab.techschool.pcbook.pb.Laptop;
import com.gitlab.techschool.pcbook.sample.Generator;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class SerializerTest {

    @Test
    public void testWriteAndReadBinaryFile() throws IOException {
        String binaryFile = "tmp/laptop.bin";
        Laptop laptop1 = new Generator().NewLaptop();

        Serializer serializer = new Serializer();
        serializer.WriteBinaryFile(laptop1, binaryFile);

        Laptop laptop2 = serializer.ReadBinaryFile(binaryFile);

        Assert.assertEquals(laptop1, laptop2);
    }
}