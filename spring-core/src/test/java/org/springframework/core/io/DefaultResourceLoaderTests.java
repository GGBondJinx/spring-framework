package org.springframework.core.io;

import org.junit.jupiter.api.Test;

/**
 * @author GG Bond
 * @date 2020/10/25 14:20
 * @description
 */
class DefaultResourceLoaderTests {

	@Test
	void test1() {
		ResourceLoader resourceLoader = new DefaultResourceLoader();

		Resource fileResource1 = resourceLoader.getResource("D:\\a.txt");
		System.out.println("fileResource1 is FileSystemResource: " + (fileResource1 instanceof FileSystemResource));

		Resource fileResource2 = resourceLoader.getResource("/d/a.tt");
		System.out.println("fileResource2 is ClassPathResource: " + (fileResource2 instanceof ClassPathResource));

		Resource urlResource1 = resourceLoader.getResource("file:D:\\a.txt");
		System.out.println("urlResource1 is URLResource: " + (urlResource1 instanceof UrlResource));

		Resource urlResource2 = resourceLoader.getResource("http://www.baidu.com");
		System.out.println("urlResource2 is URLResource: " + (urlResource2 instanceof UrlResource));

	}
}
